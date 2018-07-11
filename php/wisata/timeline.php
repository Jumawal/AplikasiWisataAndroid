 <html>
            <head>
                <title>Contoh Timeline</title>
            </head>
            <body>
           
            </body>
        </html>
            Selanjutnya di atas </head> kita buat style terlebih dahulu ,masukan kode berikut
<style type="text/css">
.bg-merah{
  background-color: #EC7777 !important;
}
.bg-hijau{
  background-color: #99BE89 !important;
}
.bg-ungu{
  background-color: #C264E1 !important;
}

.bg-oren{
  background-color: #DD9C44 !important;
}
.timeline{
  border-left: 5px solid #B0B0B0;
  margin:0px;
  padding: 0px;
  height: 100%;
  padding: 10px;
  padding-top: 0px;
  margin-left:50px;
}

.timeline li{
  list-style: none;
  margin-top:10px;
  margin-left: 20px;
  margin-bottom: 20px;
}

.timeline li .bulet{
  width: 30px;
  height: 30px;
  margin-left: -49px;
  padding: 3px;
  color: #fff; 
  box-shadow: 0 0 3px rgba(0,0,0,0.2);
  border-radius:100px;
  position: absolute;
  text-align: center;
}
.timeline li .box-time{
  width: 60px;
  padding: 5px;
  background-color: #F26248;
  color: #fff;
  height: 20px;
  box-shadow:0 3px 4px #949494;
  margin-left: -70px;
  position: relative;
  margin-bottom: 20px;
  border-radius: 5px;
  margin-top: -50px;
}

.timeline li .box .header{
  padding: 3px;
  height: 20px;
  border-bottom: 1px solid #BDBDB3;
  margin-bottom: 3px;
}

.timeline li .box .time{
  color: #888875;
  float: right;
  font-size: 12px;
}

.timeline li .box a{
  color: #64A8B7;
  font-size: 16px;
  font-family: calibri;
  font-weight: bold;
  text-decoration: none;
}

.timeline li .box a:hover{
  color: #468A99;
}

.timeline li .box small{
  color: #666659;
  font-size: 16px;
}

.timeline li .box-attachment{
  margin-top: 10px;
  margin-left: 20px;
  background-color: #EAEAEA;
  padding: 5px;
}

.timeline li .footer{
  width: 30px;
  height: 30px;
  margin-left: -49px;
  padding: 3px;
  color: #fff; 
  background-color: #C8C8BF;
  box-shadow: 0 0 3px rgba(0,0,0,0.2);
  border-radius:100px;
  position: absolute;
  text-align: center;
  top:100%;

}

.box{
  width: 100%;
  padding: 5px;
  background-color: #fff;
  border:1px solid #ccc;
  line-height: 20px;
  font-family: calibri;
  box-shadow: 0 0 3px rgba(0,0,0,0.2);
}

.btn{
  padding: 5px;
  font-size: 12px !important;
  border:none;
  text-decoration: none;
  color: #fff !important;
  margin-right:10px;
  clear: both;
  cursor: pointer;
  border-radius: 3px;
}

.btn:hover{
  opacity: 0.8;
}

.row{
  margin:5px;
  margin-left: 0px;
}
</style>
5.       Selanjutnya pada bagian <body> kita isikan
<ul class="timeline">
  <li><span class="box-time">22 Ags 2014</span></li>
  <li>
    <span class="bulet bg-hijau">ico</span>
    <div class='box'>
      <div class="header"><a href="">Muhamad ridwan</a><small> Mengomentari status anda</small><span class="time">1 jam lalu</span></div>
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      <div class="row"><a href="#" class="btn bg-hijau">More</a><a href="#" class="btn bg-merah">Sembunyikan</a></div>
    </div>
  </li>
 
  <li>
    <span class="bulet bg-merah">ico</span>
    <div class='box'>
      <div class="header"><a href="">Muhamad ridwan</a><small> Mengomentari status anda</small><span class="time">1 jam lalu</span></div>
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse
      cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non
      proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
    </div>
  </li>
  <li><span class="box-time bg-oren">22 Apr 2014</span></li>
  <li>
    <span class="bulet bg-ungu">ico</span>
    <div class='box'>
      <div class="header"><a href="">Muhamad ridwan</a><small> mengirimi Lampiran</small><span class="time">1 jam lalu</span></div>
      Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
      tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
      quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
      <div class="box-attachment">
        <div class="row">
          <b>File Attachment</b> <i>ridwan.zip</i>
        </div>
        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod
        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,
        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo
        <div class="row">
          <a class="btn bg-oren">Buka File</a>
        </div>
      </div>
    </div>
    <div class="footer"></footer>
  </li>
</ul>