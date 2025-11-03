-- Insert locations first (IDs will be 1, 2, 3)
INSERT INTO locations (location_name, address_line1, city, state, zip_code, country) VALUES
('MG Cloud', '2010 E Algonquin Rd#210', 'Schaumburg', 'IL', '60173', 'USA'),
('Client Site - NYC', '500 Tech Ave', 'New York', 'NY', '10001', 'USA'),
('Remote (Home)', '123 Lake Trail Drive', 'Lisle', 'IL', '60532', 'USA');

-- Insert visa details next (IDs will be 1, 2, 3)
INSERT INTO visa_details (visa_type, status, issue_date, expiry_date, document_number) VALUES
('H-1B', 'Approved', '2023-10-01', '2026-10-01', 'EAC2300123456'),
('L-1', 'Pending', '2024-01-15', '2027-01-15', 'WAC2400987654'),
('OPT', 'Approved', '2024-06-01', '2025-06-01', 'OPT-9012345');

-- Finally, create employees and link them using the IDs from above
INSERT INTO employees (first_name, last_name, email, job_title, phone_number, visa_id, worksite_location_id, employee_location_id) VALUES
(
  'Jane', 'Doe', 'jane.doe@mgcloud.com', 'Cloud Engineer', '555-1234',
  1, -- Visa ID 1 (H-1B)
  1, -- Worksite ID 1 (MG Cloud HQ)
  3  -- Employee Location ID 3 (Remote (Home))
),
(
  'Ravi', 'Kumar', 'ravi.kumar@mgcloud.com', 'Solutions Architect', '555-5678',
  2, -- Visa ID 2 (L-1)
  2, -- Worksite ID 2 (Client Site - NYC)
  2  -- Employee Location ID 2 (Lives at client site)
),
(
  'Chen', 'Liang', 'chen.liang@mgcloud.com', 'Data Analyst (Intern)', '555-9012',
  3, -- Visa ID 3 (OPT)
  1, -- Worksite ID 1 (MG Cloud HQ)
  3  -- Employee Location ID 3 (Remote (Home))
);