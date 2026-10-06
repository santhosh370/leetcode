# Write your MySQL query statement below
select * 
from 
(select s1.id, ifnull(s2.student,s1.student) as student
from Seat s1 left join Seat s2
on s1.id+1=s2.id
where s1.id %2<>0

union

select s2.id, s1.student as student
from Seat s1 join Seat s2
on s1.id+1=s2.id
where s1.id %2<>0) subquery
order by subquery.id