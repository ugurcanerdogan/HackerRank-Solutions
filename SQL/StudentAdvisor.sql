SELECT si.roll_number, si.name
FROM student_information as si,
     faculty_information as fi
WHERE (fi.employee_id = si.advisor)
  AND ((fi.gender = 'M' and fi.salary > 15000)
    OR (fi.gender = 'F' and fi.salary > 20000))