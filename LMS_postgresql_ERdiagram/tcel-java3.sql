--
-- PostgreSQL database dump
--

-- Dumped from database version 16.2
-- Dumped by pg_dump version 16.2

-- Started on 2024-03-19 19:46:17

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE "java3-1703";
--
-- TOC entry 4920 (class 1262 OID 16399)
-- Name: java3-1703; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "java3-1703" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'English_United States.1252';


ALTER DATABASE "java3-1703" OWNER TO postgres;

\connect -reuse-previous=on "dbname='java3-1703'"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 218 (class 1259 OID 16409)
-- Name: administrator; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.administrator (
    id integer NOT NULL,
    username character varying NOT NULL,
    password integer NOT NULL,
    baseuserid integer NOT NULL
);


ALTER TABLE public.administrator OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16408)
-- Name: administrator_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.administrator ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.administrator_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 230 (class 1259 OID 16455)
-- Name: authors; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.authors (
    id integer NOT NULL,
    first_name character varying NOT NULL,
    last_name character varying NOT NULL
);


ALTER TABLE public.authors OWNER TO postgres;

--
-- TOC entry 229 (class 1259 OID 16454)
-- Name: authors_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.authors ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.authors_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 216 (class 1259 OID 16401)
-- Name: baseuser; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.baseuser (
    id integer NOT NULL,
    firstname character varying NOT NULL,
    lastname character varying NOT NULL,
    email character varying NOT NULL,
    phonenumber character varying NOT NULL,
    address character varying NOT NULL
);


ALTER TABLE public.baseuser OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16400)
-- Name: baseuser_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.baseuser ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.baseuser_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 224 (class 1259 OID 16431)
-- Name: books; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.books (
    id integer NOT NULL,
    name character varying NOT NULL,
    genres_id integer NOT NULL,
    authors_id integer NOT NULL,
    "ısbn" integer NOT NULL,
    shelf_number integer NOT NULL
);


ALTER TABLE public.books OWNER TO postgres;

--
-- TOC entry 223 (class 1259 OID 16430)
-- Name: books_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.books ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.books_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 222 (class 1259 OID 16423)
-- Name: borrow; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.borrow (
    id integer NOT NULL,
    borrow_date character varying NOT NULL,
    due_date character varying NOT NULL,
    delivery_date character varying NOT NULL,
    book_id integer NOT NULL,
    user_id integer NOT NULL,
    borrow_claim integer NOT NULL
);


ALTER TABLE public.borrow OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16422)
-- Name: borrow_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.borrow ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.borrow_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 228 (class 1259 OID 16447)
-- Name: genres; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.genres (
    id integer NOT NULL,
    name character varying NOT NULL
);


ALTER TABLE public.genres OWNER TO postgres;

--
-- TOC entry 227 (class 1259 OID 16446)
-- Name: genres_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.genres ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.genres_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 232 (class 1259 OID 16463)
-- Name: shelfnumber; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.shelfnumber (
    id integer NOT NULL,
    number character varying NOT NULL,
    floor character varying NOT NULL,
    front character varying NOT NULL
);


ALTER TABLE public.shelfnumber OWNER TO postgres;

--
-- TOC entry 231 (class 1259 OID 16462)
-- Name: shelfnumber_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.shelfnumber ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.shelfnumber_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 220 (class 1259 OID 16417)
-- Name: user; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."user" (
    baseuser integer NOT NULL,
    id integer NOT NULL,
    identityno character varying(11)[] NOT NULL
);


ALTER TABLE public."user" OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 16416)
-- Name: user_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public."user" ALTER COLUMN baseuser ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.user_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 226 (class 1259 OID 16439)
-- Name: ısbn; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."ısbn" (
    id integer NOT NULL,
    number character varying NOT NULL,
    publication_year character varying NOT NULL,
    publisher character varying NOT NULL
);


ALTER TABLE public."ısbn" OWNER TO postgres;

--
-- TOC entry 225 (class 1259 OID 16438)
-- Name: ısbn_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public."ısbn" ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public."ısbn_id_seq"
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 4900 (class 0 OID 16409)
-- Dependencies: 218
-- Data for Name: administrator; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4912 (class 0 OID 16455)
-- Dependencies: 230
-- Data for Name: authors; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4898 (class 0 OID 16401)
-- Dependencies: 216
-- Data for Name: baseuser; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4906 (class 0 OID 16431)
-- Dependencies: 224
-- Data for Name: books; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4904 (class 0 OID 16423)
-- Dependencies: 222
-- Data for Name: borrow; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4910 (class 0 OID 16447)
-- Dependencies: 228
-- Data for Name: genres; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4914 (class 0 OID 16463)
-- Dependencies: 232
-- Data for Name: shelfnumber; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4902 (class 0 OID 16417)
-- Dependencies: 220
-- Data for Name: user; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4908 (class 0 OID 16439)
-- Dependencies: 226
-- Data for Name: ısbn; Type: TABLE DATA; Schema: public; Owner: postgres
--



--
-- TOC entry 4921 (class 0 OID 0)
-- Dependencies: 217
-- Name: administrator_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.administrator_id_seq', 1, false);


--
-- TOC entry 4922 (class 0 OID 0)
-- Dependencies: 229
-- Name: authors_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.authors_id_seq', 1, false);


--
-- TOC entry 4923 (class 0 OID 0)
-- Dependencies: 215
-- Name: baseuser_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.baseuser_id_seq', 1, false);


--
-- TOC entry 4924 (class 0 OID 0)
-- Dependencies: 223
-- Name: books_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.books_id_seq', 1, false);


--
-- TOC entry 4925 (class 0 OID 0)
-- Dependencies: 221
-- Name: borrow_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.borrow_id_seq', 1, false);


--
-- TOC entry 4926 (class 0 OID 0)
-- Dependencies: 227
-- Name: genres_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.genres_id_seq', 1, false);


--
-- TOC entry 4927 (class 0 OID 0)
-- Dependencies: 231
-- Name: shelfnumber_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.shelfnumber_id_seq', 1, false);


--
-- TOC entry 4928 (class 0 OID 0)
-- Dependencies: 219
-- Name: user_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.user_id_seq', 1, false);


--
-- TOC entry 4929 (class 0 OID 0)
-- Dependencies: 225
-- Name: ısbn_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public."ısbn_id_seq"', 1, false);


--
-- TOC entry 4731 (class 2606 OID 16415)
-- Name: administrator administrator_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.administrator
    ADD CONSTRAINT administrator_pkey PRIMARY KEY (id);


--
-- TOC entry 4743 (class 2606 OID 16461)
-- Name: authors authors_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.authors
    ADD CONSTRAINT authors_pkey PRIMARY KEY (id);


--
-- TOC entry 4729 (class 2606 OID 16407)
-- Name: baseuser baseuser_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.baseuser
    ADD CONSTRAINT baseuser_pkey PRIMARY KEY (id);


--
-- TOC entry 4737 (class 2606 OID 16437)
-- Name: books books_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books
    ADD CONSTRAINT books_pkey PRIMARY KEY (id);


--
-- TOC entry 4735 (class 2606 OID 16429)
-- Name: borrow borrow_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.borrow
    ADD CONSTRAINT borrow_pkey PRIMARY KEY (id);


--
-- TOC entry 4741 (class 2606 OID 16453)
-- Name: genres genres_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.genres
    ADD CONSTRAINT genres_pkey PRIMARY KEY (id);


--
-- TOC entry 4745 (class 2606 OID 16469)
-- Name: shelfnumber shelfnumber_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.shelfnumber
    ADD CONSTRAINT shelfnumber_pkey PRIMARY KEY (id);


--
-- TOC entry 4733 (class 2606 OID 16421)
-- Name: user user_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ADD CONSTRAINT user_pkey PRIMARY KEY (id);


--
-- TOC entry 4739 (class 2606 OID 16445)
-- Name: ısbn ısbn_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."ısbn"
    ADD CONSTRAINT "ısbn_pkey" PRIMARY KEY (id);


--
-- TOC entry 4750 (class 2606 OID 16470)
-- Name: books FK_BOOKS_AUTHORS; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books
    ADD CONSTRAINT "FK_BOOKS_AUTHORS" FOREIGN KEY (authors_id) REFERENCES public.authors(id) NOT VALID;


--
-- TOC entry 4751 (class 2606 OID 16475)
-- Name: books FK_BOOKS_GENRES; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books
    ADD CONSTRAINT "FK_BOOKS_GENRES" FOREIGN KEY (genres_id) REFERENCES public.genres(id) NOT VALID;


--
-- TOC entry 4752 (class 2606 OID 16480)
-- Name: books FK_BOOKS_ISBN; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books
    ADD CONSTRAINT "FK_BOOKS_ISBN" FOREIGN KEY ("ısbn") REFERENCES public."ısbn"(id) NOT VALID;


--
-- TOC entry 4753 (class 2606 OID 16485)
-- Name: books FK_BOOKS_SHELFNUMBER; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.books
    ADD CONSTRAINT "FK_BOOKS_SHELFNUMBER" FOREIGN KEY (shelf_number) REFERENCES public.shelfnumber(id) NOT VALID;


--
-- TOC entry 4748 (class 2606 OID 16505)
-- Name: borrow FK_BORROW_BOOKID; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.borrow
    ADD CONSTRAINT "FK_BORROW_BOOKID" FOREIGN KEY (book_id) REFERENCES public.books(id) NOT VALID;


--
-- TOC entry 4749 (class 2606 OID 16500)
-- Name: borrow FK_BORROW_USERID; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.borrow
    ADD CONSTRAINT "FK_BORROW_USERID" FOREIGN KEY (user_id) REFERENCES public."user"(id) NOT VALID;


--
-- TOC entry 4747 (class 2606 OID 16490)
-- Name: user FK_USERID_BASEUSER; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."user"
    ADD CONSTRAINT "FK_USERID_BASEUSER" FOREIGN KEY (baseuser) REFERENCES public.baseuser(id) NOT VALID;


--
-- TOC entry 4746 (class 2606 OID 16510)
-- Name: administrator FK_USER_ADMIN; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.administrator
    ADD CONSTRAINT "FK_USER_ADMIN" FOREIGN KEY (baseuserid) REFERENCES public.baseuser(id) NOT VALID;


-- Completed on 2024-03-19 19:46:18

--
-- PostgreSQL database dump complete
--

