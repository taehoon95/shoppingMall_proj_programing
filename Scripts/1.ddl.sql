select user(),database();

-- 쇼핑몰
DROP SCHEMA IF EXISTS shoppingMall;

-- 쇼핑몰
CREATE SCHEMA shoppingMall;

-- 회원
CREATE TABLE shoppingMall.customer (
	cusno  INT         NOT NULL COMMENT '회원번호', -- 회원번호
	cusname   VARCHAR(20) NULL     COMMENT '이름', -- 이름
	birth  DATE        NULL     COMMENT '생년월일', -- 생년월일
	callno VARCHAR(13) NULL     COMMENT '휴대전화번호', -- 휴대전화번호
	sex    INT         NULL     COMMENT '성별' -- 성별
)
COMMENT '회원';

-- 회원
ALTER TABLE shoppingMall.customer
	ADD CONSTRAINT PK_customer -- 회원 기본키
		PRIMARY KEY (
			cusno -- 회원번호
		);

-- 제품정보
CREATE TABLE shoppingMall.product (
	procode  CHAR(10)     NOT NULL COMMENT '제품코드', -- 제품코드
	proname  VARCHAR(200) NULL     COMMENT '제품명', -- 제품명
	proprice INT          NULL     COMMENT '제품단가', -- 제품단가
	stock    INT          NULL     COMMENT '재고' -- 재고
)
COMMENT '제품정보';

-- 제품정보
ALTER TABLE shoppingMall.product
	ADD CONSTRAINT PK_product -- 제품정보 기본키
		PRIMARY KEY (
			procode -- 제품코드
		);

-- 판매내역
CREATE TABLE shoppingMall.sale (
	orderno     INT      NOT NULL primary key auto_increment COMMENT '주문번호', -- 주문번호
	date    DATE     NULL     COMMENT '날짜', -- 날짜
	cusno   INT      NULL     COMMENT '회원번호', -- 회원번호
	procode CHAR(10) NULL     COMMENT '제품코드', -- 제품코드
	saleamount  INT      NULL     COMMENT '판매수량' -- 판매수량
)
COMMENT '판매내역';


-- 판매내역
ALTER TABLE shoppingMall.sale
	ADD CONSTRAINT FK_customer_TO_sale -- 회원 -> 판매내역
		FOREIGN KEY (
			cusno -- 회원번호
		)
		REFERENCES shoppingMall.customer ( -- 회원
			cusno -- 회원번호
		);

-- 판매내역
ALTER TABLE shoppingMall.sale
	ADD CONSTRAINT FK_product_TO_sale -- 제품정보 -> 판매내역
		FOREIGN KEY (
			procode -- 제품코드
		)
		REFERENCES shoppingMall.product ( -- 제품정보
			procode -- 제품코드
		);

grant all 
   on shoppingmall.*
   to 'user_shoppingmall'@'localhost'
identified by 'rootroot';