<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="javascript:void(0)">Logo</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="mynavbar">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link" href="javascript:void(0)">Link</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="/flight">Flight Master</a>
        </li>
        <li class="nav-item">
       <c:if test="${username eq null }">
          <a class="nav-link" href="/user/login">Login</a>
       </c:if>
        </li>
        <li>
         <c:if test="${username ne null }">
  <p class="nav-link">Welcome ${session.username }</p>
  </c:if>
        	
        </li>
     <c:if test="${username ne null }">
        <li class="nav-item">
          <a class="nav-link" href="/user/logout">Logout</a>
        </li>
       </c:if>
      </ul>

      <form class="d-flex">
        <input class="form-control me-2" type="text" placeholder="Search">
        <button class="btn btn-primary" type="button">Search</button>
      </form>
    </div>
  </div>
</nav>