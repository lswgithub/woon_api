/* name : getDate 
** desc : 날짜를 리턴한다. 
** params : optional dateObj(String, Date()), optional format ('yyyy|yy|MM|dd|E|hh|mm|ss|a/p)
*/ 
function getDate(dateObj, format) {
		if(!dateObj) dateObj = new Date();
		// if(!format) seperator = "-"

		var srcDate = new Date(dateObj);

		var year, month, day, hour, min, sec, date;
		//var week = new Array('일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일');

		if(format)  {
			date = format.replace(/(yyyy|yy|MM|dd|E|hh|mm|ss|a\/p)/gi, function (_dateRegex) {
				switch(_dateRegex) {
					case "yyyy": return srcDate.getFullYear();
					case "yy"  : return (srcDate.getFullYear()% 1000).toString().substr(-2);
					case "MM"  : return ("0" + (srcDate.getMonth()+1)).toString().substr(-2);
					case "dd"  : return ("0" + srcDate.getDate()).toString().substr(-2);
					//case "E"   : return week[srcDate.getDay()]
					case "hh"  : return ("0" + srcDate.getHours()).toString().substr(-2);
					case "mm"  : return ("0" + srcDate.getMinutes()).toString().substr(-2);
					case "ss"  : return ("0" + srcDate.getSeconds()).toString().substr(-2);
					//case "a/p" : return srcDate.getHours < 12 ? "오전" : "오후";
					default : return _dateRegex;
				}
			});
		} else {
			year  = srcDate.getFullYear();
			month = "0" + (srcDate.getMonth() + 1);
			day   = "0" + srcDate.getDate();
			hour  = "0" + srcDate.getHours();
			min   = "0" + srcDate.getMinutes();
			sec   = "0" + srcDate.getSeconds();

			date = year + "-" + month.substr(-2) + "-" + day.substr(-2) + " " + hour.substr(-2) + ":" + min.substr(-2) + ":" + sec.substr(-2);
		}
		return date;
	}