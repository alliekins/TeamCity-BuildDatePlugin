This is a very simple plugin for [TeamCity](http://www.jetbrains.com/teamcity/) that allows insertion of server dates and times. 

You can use BuildDate to insert dates anywhere TeamCity accepts %variables%.

The available variables are:

* `date.year`: Four-digit year, i.e. 2014
* `date.year.2digit`: Two-digit year, i.e. 14 

* `date.month`: Number of the month without leading zero
* `date.month.lead0`: Number of the month with leading zero
* `date.month.text`: Long form name of the month, i.e. January
* `date.month.text.abbrev`: Short form 3-letter abbreviation for the month, i.e. Jan

* `date.day`: Number day of the month without leading zero
* `date.day.lead0`: Number day of the month with leading zero

* `date.hour`: Number of hours in 12-hour format without leading zero
* `date.hour.lead0`: Number of hours in 12-hour format with leading zero
* `date.hour.24`: Number of hours in 24-hour format without leading zero
* `date.hour.24.lead0`: Number of hours in 24-hour format with leading zero

* `date.minute`: Number of seconds without leading zero
* `date.minute.lead0`: Number of seconds with leading zero

* `date.second`: Number of seconds without leading zero
* `date.second.lead0` Number of seconds with leading zero

* `date.ampm`: All-uppercase representation of either AM or PM

To construct a datetime, just string the variables together.

Example:

`%date.month.lead0%/%date.day.lead0%/%date.year%` => `01/20/2014`