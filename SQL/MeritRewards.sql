SELECT empInf.employee_ID, empInf.name
FROM employee_information empInf
         JOIN last_quarter_bonus lqb on lqb_employee_ID = empInf.employee_ID
WHERE b.bonus >= 5000
  AND empInf.division LIKE 'HR';