module ME14
			sig Publication {
			   title: one Int,
			   keywords: lone Int,
			   doi: lone Int,
			   year: lone Int,
			   fromPage: lone Int,
			   untilPage: lone Int,
			   type: one PublicationType,
			   assignedFaculty: one Faculty,
			   field: one ResearchField,
			   authors: some Person,
			   proceedings: lone Proceedings,
			   journal: lone Journal,
			   book: lone Book
			}
			sig Person {
			   firstname: one Int,
			   lastname: one Int,
			   email: one Int,
			   external: lone Int,
			   faculty: lone Faculty,
			   publibations: one Publication
			}
			sig Proceedings extends PublicationVenue {
			   publisher: lone Int,
			   volume: lone Int,
			   isbn: lone Int,
			   event: one Event,
			   editors: set Person
			}
			sig Journal extends PublicationVenue {
			   id: one Int,
			   volume: lone Int,
			   number: lone Int
			}
			sig Book extends PublicationVenue {
			   publisher: lone Int,
			   isbn: lone Int
			}
			sig PublicationVenue {
			   title: one Int
			}
			sig Event {
			   etitle: one Int,
			   city: lone Int,
			   country: lone Int,
			   fromDate: lone Int,
			   untilDate: lone Int,
			   admissionFrom: lone Int
			}
			enum Faculty{
					AP, 
					CE, 
					MIE, 
					EEIT, 
					MG, 
					P, 
					TC, 
					I 
					}
			enum ResearchField{
					CSE, 
					QPQT, 
					MM, 
					ICT, 
					EE 
					}
			enum PublicationType{
					JA, 
					BC, 
					CP, 
					WP 
					}
          
fact {all x: Publication| all y: Person | y in x.authors implies x in y.publibations
			   }
fact {all x: Person| all y: Publication | y in x.publibations implies x in y.authors
			   }
