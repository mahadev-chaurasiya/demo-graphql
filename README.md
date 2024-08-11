# demo-graphql
Example of  integration graphql in springboot

#Post : localhost:9191/graphql
mutation{
	enrollStudent(student:{
		sName:"Mahadev Chaurasiya",
		rollNo:4,
		sectionName:"D",
		className:"11",
		admissionYear:"2024"
		
	}){
		id
	}
}
===============
# Get all
query{
	getAllStudentInfo{
		id,
		rollNo,
		className,
		sectionName,
		admissionYear
	}
----------------------
# Get by ID
query{
	getStudentInfo(studentId:1){
		id,
		rollNo,
		className,
		sectionName,
		admissionYear
	}
}
---------------------------------
# Delete by id
query{
	deleteStudentRecordById(studentId:1)
}
