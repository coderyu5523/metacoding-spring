insert into board_tb (title, content, created_at) values ('제목1', '스프링 공부중1', now()); 
insert into board_tb (title, content, created_at) values ('제목2', '스프링 공부중2', now()); 




// em.persist()
insert into board_tb (title, content, created_at) values ('제목3', '내용3', now()); 

// em.flush() 실행 시 영속성화된 객체를 데이터베이스에 반영








