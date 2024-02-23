SELECT * FROM  EMP WHERE dept_no= (select dept_no from emp where  emp_name= 'SMITH');
SELECT * FROM  EMP WHERE sal  >(select sal from emp where  emp_name='FORD');
SELECT * FROM  EMP WHERE edate<(select edate from emp where  emp_name= 'JONES');
SELECT * FROM  EMP WHERE sal> (select sal from emp where  emp_name= 'BLAKE');
SELECT * FROM  EMP WHERE SAL=(select max (SAL) from emp where SAL < (select max(sal) from emp));
SELECT * FROM  EMP WHERE EMP_ID= (select EMP_ID from emp where  emp_name= 'KING');
SELECT * FROM  EMP WHERE DEPT_NO=(SELECT DEPT_NO FROM EMP WHERE EMP_NAME='BLAKE') AND EMP_NAME !='BLAKE';
SELECT * FROM  EMP WHERE DEPT_NO=(SELECT DEPT_NO FROM EMP WHERE EMP_NAME LIKE 'T%');
SELECT * FROM  EMP WHERE SAL=(select max (SAL) from emp where SAL < (select max (SAL) from emp where SAL <(select max (SAL) from emp where SAL < (select max(sal) from emp))))
