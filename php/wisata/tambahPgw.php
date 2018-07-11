
<?php
 
 /*
 
 penulis: Muhammad yusuf
 website: http://www.kodingindonesia.com/
 
 */
 
	if($_SERVER['REQUEST_METHOD']=='POST'){
		
		//Mendapatkan Nilai Variable
		$jumlah = $_POST['jumlah'];
		
		//Pembuatan Syntax SQL
		$sql = "INSERT INTO rating (jumlah) VALUES ('$jumlah')";
		
		//Import File Koneksi database
		require_once('koneksi.php');
		
		//Eksekusi Query database
		if(mysqli_query($con,$sql)){
			echo 'Berhasil Mnambahkan rating';
		}else{
			echo 'Gagal Menambahkan rating';
		}
		
		mysqli_close($con);
	}
?>