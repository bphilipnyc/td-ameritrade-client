/**
 Validation Rules for Price History

 <p>
 periodtype must be one of these values: day, month,year,ytd
 </p>

 <p>
 frequency type must be one of these values: minute, daily, weekly, monthly
 </p>

 <p>
 period - The valid values are dependent on the periodtype:
 <ul>
 <li>If periodtype=day, then period can be 1, 2, 3, 4, 5 or 10</li>
 <li>If periodtype=month, then period can be 1, 2, 3 or 6</li>
 <li>If periodtype=year, then period can be 1, 2, 3, 5 10, 15, or 20</li>
 <li>If periodtype=ytd, then period can only be 1</li>
 </ul>
 </p>

 <p>
 FrequencyType - The valid values are dependent on the periodtype.
 <ul>
   <li>if periodtype=day, then frequency type can be only be minute.</li>
   <li>if periodtype=month, then frequency type can be daily or weekly</li>
   <li>if periodtype=year, then frequency type can be daily, weekly, or monthly</li>
   <li>if periodtype=ytd, then frequency type can be daily or weekly</li>
 </ul>
 </p>

 <p>
 frequency - The valid values are dependent on the frequencytype.
 <ul>
 <if frequencytype=minute, then frequency can be 1, 5, 10, 15, or 30</li>
 <li>if frequencytype=daily, then frequency can only be 1</li>
 <li>if frequencytype=weekly, then frequency can only be 1</li>
 <li>if frequencytype=monthly, then frequency can only be 1</li>
 </ul>
 </p>

 <p>
 startdate and enddate - If specified, then period and periodtype CANNOT be specified.
 end date cannot be greater than start date, obviously.
 </p>

 */
package com.studerw.tda.model.history;

