
public class Ex2 {
	public static void main(String[] args) throws Exception
	{
	throw new UnsupportedFuctionException("지원하지 않는 기능입니다",100); 
	}
}

class UnsupportedFuctionException extends RuntimeException{
	private final int ERR_CODE;
	
	UnsupportedFuctionException(String msg, int errCode){
		super(msg);
		ERR_CODE = errCode;
	}
	
	UnsupportedFuctionException(String msg){
		this(msg, 100);
	}
	
	
	public int getErrCode() {
		return 0;
	}
	
	@Override
	public String getMessage() {
		return "";
	}
}