select user(),database();

desc customer;
desc product;
desc sale;

select * from customer;
select * from product;
select * from sale;

-- Main 화면 형식 sql문
create view vw_main
as
select date_format(date, "%Y.%m.%d") as date 
	   ,c.cusNo,c.cusName,callNo,p.procode,saleamount,proPrice*saleamount*1.1 as sale
  from sale s join product p on s.procode = p.procode join customer c on s.cusNo = c.cusNo
  order by date, c.cusNo desc;
 
select * from vw_main;
select date,cusNo,cusName,callNo,procode,saleamount,sale from vw_main;
-- 제품별 조회
create view vw_product
as
select c.cusNo,date_format(date, "%Y.%m.%d") as date 
	   ,p.procode ,p.proName, saleamount, p.proprice 
	   ,p.proprice*saleamount*1.1 as sale
	   ,p.proprice*saleamount*1.1 - p.proPrice*saleamount as profit 
  from sale s join product p on s.procode = p.procode join customer c on s.cusNo = c.cusNo
  order by date, p.procode;


drop view vw_product;
 
select * from vw_product;

-- 상세 조회 
create view vw_detail
as
select  date_format(date, "%Y.%m.%d") as date 
	   ,p.procode,p.proName,c.cusName ,saleamount ,p.proPrice
	   ,p.proPrice*saleamount*1.1 as sale
	   ,p.proPrice*saleamount*1.1 - p.proPrice*saleamount as profit 
  from sale s join product p on s.procode  = p.procode join customer c on s.cusNo = c.cusNo
  order by date, c.cusNo;
  
select * from vw_detail;