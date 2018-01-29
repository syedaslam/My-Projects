<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="container">
  <h2>Change Password</h2>
  <form class="form-horizontal" action="./changePassword" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" >Reg. No. :</label>
      <div class="col-sm-10">
        <input type="number" name="regno" class="form-control"  placeholder="Reg no" required="required">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" >Current Password : </label>
      <div class="col-sm-10">
        <input type="password" name="currPass" class="form-control"  placeholder="Current Password" required="required">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" >New Password : </label>
      <div class="col-sm-10">
        <input type="password" name="newPass" class="form-control"  placeholder="New Password" required="required">
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" >Conform Password : </label>
      <div class="col-sm-10">
        <input type="password" name="retypePass" class="form-control"  placeholder="Retype Password" required="required">
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Change</button>
      </div>
    </div>
  </form>
</div><br><br><br>
</body>
</html>
