import java.time.LocalDate;

class DVD extends Item {
	    private LocalDate releaseDate;
	    private int durationMinutes;
	    
		public DVD(String referenceNumber, String title, boolean suitableForChildren, double replacementValue, String location, LocalDate releaseDate, int durationMinutes) {
	        super(referenceNumber, title, suitableForChildren, replacementValue, location);
	        this.releaseDate = releaseDate;
	        this.durationMinutes = durationMinutes;
	        this.type = "DVD";
		}

	    public LocalDate getReleaseDate() {
			return releaseDate;
		}

		public void setReleaseDate(LocalDate releaseDate) {
			this.releaseDate = releaseDate;
		}

		public int getDurationMinutes() {
			return durationMinutes;
		}

		public void setDurationMinutes(int durationMinutes) {
			this.durationMinutes = durationMinutes;
		}
		
	}
	