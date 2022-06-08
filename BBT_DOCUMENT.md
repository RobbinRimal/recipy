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
| 10    | 1    | Make sure there is an allocation of guaranteed classes of teachers.  |If there are same guarantees classes values of multiple teacher?  Select two paths and continue the parallel paths accordinly.|
| 10      | 2       | Check if it  has sequential time and matching teacher with the same teacher otherwise go to the next rule.   | |
