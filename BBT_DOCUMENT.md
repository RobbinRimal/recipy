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

These condition are all set by the system during the booking phase transmitted from websocke protocol. 

## 2. Meeting Lifecycle
      Meeting has primarily 13 types of state:



- AVAILABLE

   >This is the first state where every timeslot created by Teacher gets pre-set with this State. Also this state does not contain any student data because it is only for teacher data.

- PRE_SCHEDULED
- RE_SCHEDULED
- SCHEDULED
   >Scheduled one is state for booked meeting which has confirmed student and its timeslot gets reserved
- COMPLETED
   >This meeting is for the completed meeting successfully without any problem. Normally this means the teacher gets fully paid and student gets debited by x number of coins.
- CANCELLED
- WAIT_APPROVAL
- REVIEW
   >This is a stage where the class is sent to admin in order to review.
- REFUNDED
   >Refunded is state where parent got the refund and the teacher got the penalty. 
- MISSED
- TRANSFERRED
- REQUEST_TRANSFER
- DELETED

A meeting has its predefined rules for changing its state from  **SCHEDULED** to many different states as per the rules.


| Rule      | Condition | From State    |To State|
| :---        |    :----:   | :----: |    ---: |
| 1     | Teacher joined meeting before 5 minutes of meeting start time student did not joined the meeting       | SCHEDULED   | COMPLETED   |
| 2   | Student joined meeting after 5 min of start meeting       | SCHEDULED      | REFUNDED|
| 3   | Neighter student joined the meeting nor teacher        | SCHEDULED      | REFUNDED (Double)|


### 3. Coin Lifecycle

 Coin is a virtual currency in BigBigTutuor system. Every coin is representation of native currency value for a single class. Every coin has its state directly linked with the Meeting entity. A coin has been distinctly managed by two types:
    
- STANDARD
      
   >Standard coin are the normal coin where the coin is simply  assigned to random teacher according to the booking algorithm
   
- PREMIUM
    >Every premium coin has higher native currency value than the Standard Coin and this coin has a feature to select preferred Teacher from the Teacher list during the booking phase. 

Every coin‘s native currency value is determined by Exchange rate and there can only be one exchange rate set for each coin. A coin has its own hash code which makes it unique and spendable to preferred user. The spend of coin is mathematically calculated by using Coin history data.  There are more than one history for each coin. 


## 4. Internal Application Architecture
   
   Our application is built using single monolithic application using Quarkus Framework (Java). The application has its core component like

![Internal Application Architecture
!](internal.svg "Internal Application Architecture
")







Source : s3://bbt-media/docs/application-arch.svg

## 5. Deployment Architecture
      > todo

