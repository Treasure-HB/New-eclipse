package 폴리랜드;

public class StringValue {
	
		
		public static String TICKET_TIME_QUESTION;
		public static String TICKET_TYPE_QUESTION;
		public static String TICKET_COUNT_QUESTION;
		public static String TICKET_PRIOTRITY_QUESTION;
		public static String TICKET_PRIOTRITY_QUESTION1;
		public static String TICKET_PRIOTRITY_QUESTION2;
		public static String TICKET_PRIOTRITY_QUESTION3;
		public static String TICKET_PRIOTRITY_QUESTION4;
		public static String TICKET_PRIOTRITY_QUESTION5;
		public static String TICKET_END_QUESTION;
		
		private static String receipt_Time;
		private static String receipt_Type;
		private static String receipt_Count;
		private static String receipt_Price;
		private static String receipt_Priority;
		private static String receipt_Total;
		
	
		public static void startLanguage(String country){
			Repeat repeat = new Repeat();
			if(repeat.getLANGUAGE().equals("KR")) {
				StringValue.TICKET_TIME_QUESTION = "권종을 입력하세요)";
				StringValue.TICKET_TYPE_QUESTION = "생년월일을 입력하세요 ex)1900-01-01";
				StringValue.TICKET_COUNT_QUESTION = "몇 장 주문하시겠습니까? (최대 10장)";
				StringValue.TICKET_PRIOTRITY_QUESTION = "우대사항을 선택하세요";
				StringValue.TICKET_PRIOTRITY_QUESTION1 = "1. 없음(나이우대는 자동처리)";
				StringValue.TICKET_PRIOTRITY_QUESTION2 = "2. 장애인";
				StringValue.TICKET_PRIOTRITY_QUESTION3 = "3. 국가유공자";
				StringValue.TICKET_PRIOTRITY_QUESTION4 = "4. 다자녀";
				StringValue.TICKET_PRIOTRITY_QUESTION5 = "5. 임산부";
				StringValue.TICKET_END_QUESTION = "계속하시겠습니까  1. 계속 2. 종료";
				
				StringValue.receipt_Time = "시간";
				StringValue.receipt_Type = "권종";
				StringValue.receipt_Count = "수량";
				StringValue.receipt_Price = "가격";
				StringValue.receipt_Priority = "우대사항";
				StringValue.receipt_Total  = "합 계";
				
				
			} else {
				StringValue.TICKET_TIME_QUESTION = "-Input ticket time  1)Day  2)Night";
				StringValue.TICKET_TYPE_QUESTION = "-Input your birthday ex)1900-01-01";
				StringValue.TICKET_COUNT_QUESTION = "-How many tickets do you want? (Maximum 10)";
				StringValue.TICKET_PRIOTRITY_QUESTION = "-Do you have any priority?";
				StringValue.TICKET_PRIOTRITY_QUESTION1 = "1. No (Age is already counting)";
				StringValue.TICKET_PRIOTRITY_QUESTION2 = "2. Disabled";
				StringValue.TICKET_PRIOTRITY_QUESTION3 = "3. Meritorious persons";
				StringValue.TICKET_PRIOTRITY_QUESTION4 = "4. Multichild";
				StringValue.TICKET_PRIOTRITY_QUESTION5 = "5. Pregnant";
				StringValue.TICKET_END_QUESTION = "-Do you want continue?  1. continue 2. end";
				
				StringValue.receipt_Time = "Time";
				StringValue.receipt_Type = "Type";
				StringValue.receipt_Count = "Count";
				StringValue.receipt_Price = "Price";
				StringValue.receipt_Priority = "Priority";
				StringValue.receipt_Total = "Total";
						
			}
			
			
		
		}


		public static String getReceipt_Total() {
			return receipt_Total;
		}

		public static String getTICKET_TIME_QUESTION() {
			return TICKET_TIME_QUESTION;
		}

		public static String getTICKET_TYPE_QUESTION() {
			return TICKET_TYPE_QUESTION;
		}

		public static String getTICKET_COUNT_QUESTION() {
			return TICKET_COUNT_QUESTION;
		}


		public static String getTICKET_PRIOTRITY_QUESTION() {
			return TICKET_PRIOTRITY_QUESTION;
		}


		public static String getTICKET_PRIOTRITY_QUESTION1() {
			return TICKET_PRIOTRITY_QUESTION1;
		}

		public static String getTICKET_PRIOTRITY_QUESTION2() {
			return TICKET_PRIOTRITY_QUESTION2;
		}


		public static String getTICKET_PRIOTRITY_QUESTION3() {
			return TICKET_PRIOTRITY_QUESTION3;
		}


		public static String getTICKET_PRIOTRITY_QUESTION4() {
			return TICKET_PRIOTRITY_QUESTION4;
		}


		public static String getTICKET_PRIOTRITY_QUESTION5() {
			return TICKET_PRIOTRITY_QUESTION5;
		}


		public static String getTICKET_END_QUESTION() {
			return TICKET_END_QUESTION;
		}



		public static void setReceipt_Total(String receipt_Total) {
			StringValue.receipt_Total = receipt_Total;
		}

		public static void setTICKET_TIME_QUESTION(String tICKET_TIME_QUESTION) {
			TICKET_TIME_QUESTION = tICKET_TIME_QUESTION;
		}

		public static void setTICKET_TYPE_QUESTION(String tICKET_TYPE_QUESTION) {
			TICKET_TYPE_QUESTION = tICKET_TYPE_QUESTION;
		}


		public static void setTICKET_COUNT_QUESTION(String tICKET_COUNT_QUESTION) {
			TICKET_COUNT_QUESTION = tICKET_COUNT_QUESTION;
		}


		public static void setTICKET_PRIOTRITY_QUESTION(String tICKET_PRIOTRITY_QUESTION) {
			TICKET_PRIOTRITY_QUESTION = tICKET_PRIOTRITY_QUESTION;
		}


		public static void setTICKET_PRIOTRITY_QUESTION1(String tICKET_PRIOTRITY_QUESTION1) {
			TICKET_PRIOTRITY_QUESTION1 = tICKET_PRIOTRITY_QUESTION1;
		}


		public static void setTICKET_PRIOTRITY_QUESTION2(String tICKET_PRIOTRITY_QUESTION2) {
			TICKET_PRIOTRITY_QUESTION2 = tICKET_PRIOTRITY_QUESTION2;
		}


		public static void setTICKET_PRIOTRITY_QUESTION3(String tICKET_PRIOTRITY_QUESTION3) {
			TICKET_PRIOTRITY_QUESTION3 = tICKET_PRIOTRITY_QUESTION3;
		}


		public static void setTICKET_PRIOTRITY_QUESTION4(String tICKET_PRIOTRITY_QUESTION4) {
			TICKET_PRIOTRITY_QUESTION4 = tICKET_PRIOTRITY_QUESTION4;
		}


		public static void setTICKET_PRIOTRITY_QUESTION5(String tICKET_PRIOTRITY_QUESTION5) {
			TICKET_PRIOTRITY_QUESTION5 = tICKET_PRIOTRITY_QUESTION5;
		}


		public static void setTICKET_END_QUESTION(String tICKET_END_QUESTION) {
			TICKET_END_QUESTION = tICKET_END_QUESTION;
		}


		public static String getReceipt_Time() {
			return receipt_Time;
		}


		public static void setReceipt_Time(String receipt_Time) {
			StringValue.receipt_Time = receipt_Time;
		}


		public static String getReceipt_Type() {
			return receipt_Type;
		}


		public static void setReceipt_Type(String receipt_Type) {
			StringValue.receipt_Type = receipt_Type;
		}


		public static String getReceipt_Count() {
			return receipt_Count;
		}


		public static void setReceipt_Count(String receipt_Count) {
			StringValue.receipt_Count = receipt_Count;
		}


		public static String getReceipt_Price() {
			return receipt_Price;
		}


		public static void setReceipt_Price(String receipt_Price) {
			StringValue.receipt_Price = receipt_Price;
		}


		public static String getReceipt_Priority() {
			return receipt_Priority;
		}


		public static void setReceipt_Priority(String receipt_Priority) {
			StringValue.receipt_Priority = receipt_Priority;
		}
		
		
	}
