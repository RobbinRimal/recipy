# Application Logic Documentation 


## 1. Application Logic Documentation

Every teacher has its own timeslots that they can setup. The timeslot is 25 min eg. if a teacher is available from 10 am to 11 am then it starts with 


   - 10:00 - 10:25 
   - 10:30 - 10:55
   - 11:00 - 11:25
   - 11:30 - 11:55

There can be multiple Teachers in same timeslots in that case we have a detailed logic for race conditional teacher selection.


| Weight     | Rule | Condition     | How to implement?     |
| :---        |    :----:   |  :----:       |---: |
| 10    | 1    | Make sure there is an allocation of guaranteed classes of teachers.  |If there are same guarantees classes values of multiple teacher?  Select two paths and continue the parallel paths accordinly.<br/>
Mike: 3 , Simon: 3 ?<br/> 

If there is a history of meeting where Simon teaches this users then Rule 2 overrides the Rule 1. 
Mike: 1 (guaranteed class) , Simon: 0 (Previous meeting) ? 
<br/>
Double class or (n) number of classes sequence (25 minutes difference between old and new class)
Must always put old teacher as priority while selecting booking.|




| Header      | Title       | Here's this   |next |
