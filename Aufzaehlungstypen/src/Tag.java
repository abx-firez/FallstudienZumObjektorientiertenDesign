
public enum Tag {
	MONTAG, DIENSTAG, MITTWOCH, DONNERSTAG, FREITAG, SAMSTAG, SONNTAG;
	
	public int arbeitszeit(){
		switch (this){
		case MONTAG:        // ACHTUNG: Durchfallend
		case DIENSTAG:
		case MITTWOCH:
		case DONNERSTAG:
		case FREITAG:
			return 8;
		case SAMSTAG:
			return 4;
		case SONNTAG:
			return 0;
		}
		return 0;
	}
}
