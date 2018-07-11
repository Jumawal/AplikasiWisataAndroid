<!DOCTYPE html>
<html>
<head>

</head>
<body>
       <h3>Komentar</h3>
 <?php
    include 'koneksi.php';

    $rating = mysqli_query($con, "SELECT * FROM pantailabuan");
    $no=1;
    foreach ($rating as $row){
     ?>

 
      
<div class="row">
  <div class="side">
   


    <div style=" color: black; margin-top: 20px; line-height: 20px; background: #f2f2f9; width: 100%; height: 100%; ">
      
     
        <p>Rating :  <?php echo "".$row['rating'].""; ?></p>
        
        <table>
            <tr>
            
             <td ><?php echo "".$row['Email']."" ; ?>:
            <?php echo "".$row['coment'].""; ?></td>
            </tr>
       
        </table>
   
</div>
 </div>
</div>
<?php } ?>
</body>
</html>
