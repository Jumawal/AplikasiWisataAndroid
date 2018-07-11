<html lang="en">
<head>
  <title></title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container" >
  <h2></h2>
  <p style="text-align:center; font-weight:bold;">rating</p>            
  <table class="table table-bordered" border="" style="text-align: center;">
    <thead>
    <tr>
      <th scope="col">Rating</th>
      
    </tr>
  </thead>
  <tbody>
    <?php
    include 'koneksi.php';
    $rating = mysqli_query($con, "SELECT * from rating where ID = 1");
    $no=1;
    foreach ($rating as $row){
     
        echo "<tr>
            
            <td>".$row['Jumlah']."</td>
			 </tr>";
        $no++;
    }
    ?>
  </tbody>
</table>

</body>
</html>