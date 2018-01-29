-- TOPOLOGIA
drop user usrtrtophsrocc cascade;

create user usrtrtophsrocc identified by usrtrtophsrocc default tablespace users profile default account unlock;
grant connect to usrtrtophsrocc with admin option;
grant resource to usrtrtophsrocc with admin option;
grant create materialized view to usrtrtoplitvil with admin option;

-- ICECOFSIM
drop user usrtricecofsimhsrocc cascade;

create user usrtricecofsimhsrocc identified by usrtricecofsimhsrocc default tablespace users profile default account unlock;
grant connect to usrtricecofsimhsrocc with admin option;
grant resource to usrtricecofsimhsrocc with admin option;


---------IMP-------------------------
-- DIRECTORY
create or replace directory DPUMP_DIR1 as 'D:\apps\HHR.SW.RT.V.2.0.1.0\dumps';

-- TOPOLOGIA
impdp system/admin@regdb directory=DPUMP_DIR1 dumpfile=EXPDP_USRTRTOPHSROCC_20170814.DMP schemas=usrtrtophsrocc 
impdp usrdba/usrdba@regdb directory=RT_DIR dumpfile=EXPDP_USRTRTOPHSROCC_20171214.DMP schemas=usrtrtophsrocc 

-- ICECOFSIM
impdp system/admin@regdb directory=DPUMP_DIR1 dumpfile=EXPDP_USRTRTOPHSROCC_20171214.DMP schemas=usrtricecofsimhsrocc 
