select user(),database();

use shoppingmall;

desc customer;
desc product;
desc sale;

insert into customer 
     values ('12001','홍길동','19770405','010-9741-5821',1),
     	    ('12002','김연수','19850301','010-4568-5581',2),
     	    ('12003','김지원','19860708','010-9111-5556',2),
     	    ('12004','문희원','19800108','010-7777-7777',2),
     	    ('12005','유일한','19790205','010-4566-8886',2),
     	    ('12006','김동수','19811123','010-1231-1211',2),
     	    ('12007','배진태','19820707','010-7877-7777',2),
     	    ('12008','류은수','19830301','010-7444-1474',2),
     	    ('12009','김동철','19870426','010-8525-1235',2),
     	    ('12010','최홍석','19900405','010-3214-6547',2);


     	
select * from customer;

insert into product 
     values ('PA','책상',10000,100),
     	    ('PB','냉장고',36000,40),
     	    ('PC','세탁기',22000,80),
     	    ('PD','VTR',30000,100),
     	    ('PE','자전거',90000,60),
     	    ('PF','시계',6000,10),
     	    ('PG','TV',8000,50),
     	    ('PH','탁자',3000,100);
     	    
select * from product;

insert into sale (date,cusno ,procode ,saleamount)
	 values ('2012.03.24','12003','PA',2),
	        ('2012.03.27','12001','PA',1),
	        ('2012.04.03','12009','PC',1),
	        ('2012.04.07','12010','PF',5),
	        ('2012.04.13','12003','PF',4),
	        ('2012.04.14','12002','PE',3),
	        ('2012.04.14','12004','PH',10),
	        ('2012.04.15','12005','PG',7),
	        ('2012.04.17','12006','PG',2),
	        ('2012.04.19','12007','PA',9),
	        ('2012.04.20','12001','PB',3),
	        ('2012.04.20','12005','PD',2),
	        ('2012.04.20','12006','PG',2),
	        ('2012.04.22','12010','PH',1),
	        ('2012.04.26','12010','PH',5),
	        ('2012.05.01','12003','PB',7);
	       

select date_format(date, "%Y.%m.%d") from sale; 

select * from sale;
select * from product;
select * from customer;