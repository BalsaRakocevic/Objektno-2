
	package model;

	import jakarta.persistence.*;
	import java.util.List;
import java.util.Set;

	@Entity
	public class Student {
	    @Id
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_seq")
	    private Long id;

	    private String ime;
	    private String prezime;
	    private String jmbg;

	    
	    
	    public Student() {
	    	super();
	    }
	    
	    public Student(Long id, String ime, String prezime, String jmbg) {
			super();
			this.id = id;
			this.ime = ime;
			this.prezime = prezime;
			this.jmbg = jmbg;
		}

		@ManyToMany
	    @JoinTable(
	        name = "student_predmet",
	        joinColumns = @JoinColumn(name = "student_id"),
	        inverseJoinColumns = @JoinColumn(name = "predmet_id")
	    )
	    private List<Predmet> predmeti;
		
		
		
	    @OneToMany(mappedBy = "student")
	    private List<Ispit> ispiti;

		@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    @JoinColumn(name = "student_id")
		
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getIme() {
			return ime;
		}

		public void setIme(String ime) {
			this.ime = ime;
		}

		public String getPrezime() {
			return prezime;
		}

		public void setPrezime(String prezime) {
			this.prezime = prezime;
		}

		public String getJmbg() {
			return jmbg;
		}

		public void setJmbg(String jmbg) {
			this.jmbg = jmbg;
		}

		public List<Predmet> getPredmeti() {
			return predmeti;
		}

		public void setPredmeti(List<Predmet> predmeti) {
			this.predmeti = predmeti;
		}

		public List<Ispit> getIspiti() {
			return ispiti;
		}

		public void setIspiti(List<Ispit> ispiti) {
			this.ispiti = ispiti;
		}

	
	}


