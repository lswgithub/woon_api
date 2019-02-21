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

/* name : getEndOfMonthDay 
** desc : 해당 월의 마지막 날을 리턴한다. 
** params :(month, year)
*/ 

function getEndOfMonthDay(m, y) { 
    return m===2?y&3||!(y%25)&&y&15?28:29:30+(m+(m>>3)&1);
}

/**
	 * 한글 조사 연결 (을/를,이/가,은/는,로/으로)
	 * 1. 종성에 받침이 있는 경우 '을/이/은/으로/과'
	 * 2. 종성에 받침이 없는 경우 '를/가/는/로/와'
	 * 3. '로/으로'의 경우 종성의 받침이 'ㄹ' 인경우 '로'
	 * 참고 1 : http://gun0912.tistory.com/65 (소스 참고)
	 * 참고 2 : http://www.klgoodnews.org/board/bbs/board.php?bo_table=korean&wr_id=247 (조사 원리 참고)
     * 출처 : https://opensrc.tistory.com/176
	 * @param name
	 * @param firstValue
	 * @param secondValue
	 * @return
	 */
	function getPostWord(str,firstVal, secondVal) {

	try {
			var laststr = str.charAt(str.length() - 1);
			// 한글의 제일 처음과 끝의 범위밖일 경우는 오류
			if (laststr < 0xAC00 || laststr > 0xD7A3) {
			    return str;
			}
	
			var lastCharIndex = (laststr - 0xAC00) % 28;
	
			// 종성인덱스가 0이상일 경우는 받침이 있는경우이며 그렇지 않은경우는 받침이 없는 경우
			if(lastCharIndex > 0) {
				// 받침이 있는경우
				// 조사가 '로'인경우 'ㄹ'받침으로 끝나는 경우는 '로' 나머지 경우는 '으로'
				if(firstVal.equals("으로") && lastCharIndex == 8) {
					str += secondVal;
				} else {
					str += firstVal;
				}
			} else {
				// 받침이 없는 경우
				str += secondVal;
			}
		} catch (e) {
			//e.printStackTrace();
		}

		return str;
	}

var name;
name = "네이버";
console.log(getPostWord(name,"으로","로"));
console.log(getPostWord(name,"을","를"));
console.log(getPostWord(name,"이","가"));
console.log(getPostWord(name,"은","는"));
console.log(getPostWord(name,"과","와"));