module ME14
			sig Student {
			   name: one Int,
			   likes: one Course,
			   enrols: one Course
			}
			sig Course {
			   title: one Int,
			   isEnroledBy: set Student,
			   isLikedBy: set Student
			}
          
fact {all x: Student| all y: Course | y in x.likes implies x in y.isLikedBy
			   }
fact {all x: Student| all y: Course | y in x.enrols implies x in y.isEnroledBy
			   }
fact {all x: Course| all y: Student | y in x.isEnroledBy implies x in y.enrols
			   }
fact {all x: Course| all y: Student | y in x.isLikedBy implies x in y.likes
			   }
fact {all x: Course | #x.isEnroledBy >=10}
fact {all x: Course | #x.isLikedBy >=5}
fact {all x: Course | #x.isLikedBy <=5}
