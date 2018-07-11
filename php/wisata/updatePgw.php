 <?php
 /*
 
 penulis: Muhammad yusuf
 website: http://www.kodingindonesia.com/
 
 */
	if($_SERVER['REQUEST_METHOD']=='POST'){
		//MEndapatkan Nilai Dari Variable 
		$id = $_POST['id'];
		$jumlah = $_POST['jumlah'];
	
		
		//import file koneksi database 
		require_once('koneksi.php');
		
		//Membuat SQL Query
		$sql = "UPDATE rating SET jumlah = '$jumlah' WHERE id = $id;";
		
		//Meng-update Database 
		if(mysqli_query($con,$sql)){
			echo 'Berhasil Update rating';
		}else{
			echo 'Gagal Update Data rating';
		}
		
		mysqli_close($con);
	}
?>