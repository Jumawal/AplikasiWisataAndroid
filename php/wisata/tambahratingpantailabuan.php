
<?php
 
 /*
 
 penulis: Muhammad yusuf
 website: http://www.kodingindonesia.com/
 
 */
 
	if($_SERVER['REQUEST_METHOD']=='POST'){
		
		//Mendapatkan Nilai Variable
		$Email = $_POST['Email8'];
		$coment = $_POST['coment8'];
		$rating = $_POST['rating8'];
		//Pembuatan Syntax SQL
		$sql = "INSERT INTO pantailabuan (Email,coment,rating) VALUES ('$Email','$coment','$rating')";
		
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