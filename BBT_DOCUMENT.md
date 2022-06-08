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
| 10      | 2       | Check if it  has sequential time and matching teacher with the same teacher otherwise go to the next rule.   | 
| 5      | 3       | Every teacher must get at least one class a day if they have a time slot.|What if there are 5 teachers with no meetings in that day.|
|4|4|After every teacher has got class a day then we check their number of time slots as a priority to assign|What if all the teachers has at least one class in that day.Simon: 1 timeslot:10, Karl: 1 timeslot:9, Ram:1 timeslot:8 - Use the one that provides more available timeslot?|
|3|5|Check the usage of timeslots of each teacher, the lower ones get the first priority|What if there are multiple teachers who has similar timeslots and similar booking percentage.|