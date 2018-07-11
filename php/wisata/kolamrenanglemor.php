
<?php
 
 /*
 
 penulis: Muhammad yusuf
 website: http://www.kodingindonesia.com/
 
 */
 
	if($_SERVER['REQUEST_METHOD']=='POST'){
		
		//Mendapatkan Nilai Variable
		$Email = $_POST['Email24'];
		$coment = $_POST['coment24'];
		$rating = $_POST['rating24'];
		//Pembuatan Syntax SQL
		$sql = "INSERT INTO kolamrenanglemor (Email,coment,rating) VALUES ('$Email','$coment','$rating')";
		
		//Import File Koneksi database
		require_once('koneksi.php');
		
		//Eksekusi Query database
		if(mysqli_query($con,$sql)){
			echo 'Terimakasih';
		}else{
			echo 'Gagal Menambahkan rating';
		}
		
		mysqli_close($con);
	}
?>