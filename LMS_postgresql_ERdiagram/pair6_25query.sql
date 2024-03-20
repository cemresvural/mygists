-- 1.çalışanların şehirleri nerelerdir ?
 Select DISTINCT city from employees;
 
-- 2.nakliyatçıların şirket isimleri nedir?
Select company_name from shippers;

--3.customer_id si VINET olan müşterinin toplam kaç sipariş geçmişi vardır ? 
Select COUNT(customer_id) from orders where customer_id = 'VINET';

-- 4.kaç farklı tedarikçi bulunmaktadır? 
Select COUNT(supplier_id) from suppliers
Select * from suppliers

--5.Hangi ülkelerle ihracat yapıyorum?
Select DISTINCT country from suppliers 

--6.Categories tablosunda Con ile başlayan kategori isimleri nedir?
Select * from categories where category_name LIKE 'Con%';

--7.Categories tablosunda kategori isminde ro geçen kategori isimleri hangileridir?
Select * from categories where category_name LIKE '%ro%';

--8.Orders tablosundaki son 10 siparişim nedir?
Select * from orders ORDER BY order_date  DESC LIMIT 10;

-- 9.Baş harfi R ile başlayan siparişleri görüren toplam gemi sayısı kaçtır?
Select COUNT(order_id) from orders WHERE ship_name LIKE 'R%';

--10. Doğum tarihi 01.01.1940 ve 01.01.1960 arasında olan çalışanların ad ve soyadlarını getiriniz.
select first_name,last_name from employees where birth_date BETWEEN '1940-01-01' and '1960-01-01';

-- 11.En son işe alınanların isimleri nedir?
Select first_name from employees ORDER BY hire_date  DESC LIMIT 3;

-- 12.1996 yılında 1 yıl boyunca gelen sipariş toplamı nedir?
select COUNT(order_id) from orders where order_date BETWEEN '1996-01-01' and '1996-12-31';

-- 13.Çalışanların doğum tarihleri 1960 ile 1963 arasında olan ve Londrada yaşayan çalışan isimleri
Select first_name from employees where birth_date BETWEEN '1960-01-01' and '1963-12-31' and city = 'London';

-- 14.Ortalama ürün fiyatının üzerinde olan ürünler hangileri?
Select product_name,unit_price from products where unit_price >(Select AVG(unit_price) from products);

-- 15.Doğum günü bugün olan çalışanlarım kimler?
SELECT * FROM employees 
WHERE EXTRACT(DAY FROM birth_date) = EXTRACT(DAY FROM CURRENT_DATE) 
AND EXTRACT(MONTH FROM birth_date) = EXTRACT(MONTH FROM CURRENT_DATE);

-- 16.1993 yılından sonra işe alınan çalışanların adı ve soyadı nedir?
Select first_name, last_name from employees where hire_date > '1993.01.01' ;

-- 17.Fransızca bilgisi olan çalışanlarım kimlerdir?
select first_name , last_name from Employees where notes like '%French%';

-- 18.Unit stock minimum olan ürün isimlerini nedir?
Select product_name from products where units_in_stock = (Select MIN(units_in_stock) from products);

-- 19.Ortalama satış miktarının üzerine çıkan satışlarım hangisi?
SELECT  * FROM order_details WHERE quantity> (SELECT AVG(quantity) FROM order_details);

-- 20.En çok hangi eyalet bölgesinden alışveriş yapılmıştır?
Select MAX(state_region)from us_states;


--21.Bir ürün en fazla kaç kere yeniden sipariş edilmiştir?
Select MAX(reorder_level) from products;
--22.En çok  yeniden sipariş edilen ürünlerin isimleri nedir?
Select product_name from products where reorder_level = (Select MAX(reorder_level) from products);
--23.Sales Manager  olan ve Sevilla da yaşayan müşterilerim kimlerdir?
Select contact_name from customers where contact_title = 'Sales Manager'  and city = 'Sevilla';

--24.En fazla yük hangi gemiye yüklenmiştir?
Select ship_name from orders where freight = (Select MAX(freight) from orders);


--25.Fiyatı en yüksek olan ürünümün indirim oranı en fazla kaç olmuştur?
Select  MAX(discount) from order_details
WHERE unit_price = (Select MIN(unit_price) from order_details);
--26.Teslimatı geciken siparişler hangileridir?
SELECT order_id,customer_id, shipped_date - required_date as gec_teslim_gün_sayisi from orders
WHERE  shipped_date>required_date ;


