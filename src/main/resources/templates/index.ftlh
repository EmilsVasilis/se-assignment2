<!DOCTYPE html>
<html>
  <head><title></title>
      <link rel="stylesheet" href="tachyons.min.css">
      <link rel="stylesheet" href="stylesheet.css">
  </head>
  <body class="ph3 pt0 pb4 mw7 center sans-serif">
    <h1 class="f2 mb0"><span class="gold">i</span>Calc</h1>
    <p class="f5 mt1 mb4 lh-copy">A simple spring boot calculator app, enjoy!</p>
    <form action="/note" method="POST" enctype="multipart/form-data">
        <ol class="list pl0">
            <li class="mv3"><label class="f6 b db mb2" for="description">Write your expression here</label>
                <textarea class="f4 db border-box hover-black w-100 measure ba b--black-20 pa2 br2 mb2" rows="5"
                          name="description"><#if description??>${description}</#if></textarea>
                <input class="f6 link dim br1 ba bw1 ph3 pv2 mb2 dib black bg-white pointer" type="submit" value="Solve"
                       name="add">
            </li>
        </ol>
    </form>
    <#if result??>
      <p>${result}</p>
      <p></p>
    <#else>
      <p class="lh-copy f6">You don't have any expressions yet.</p>
    </#if>
  </body>

  <img src="AdobeStock_60467600_cup.jpg" class="bodyc" style="width: 90%; height: 40%;">
  <img src="programming.gif" alt="Computer man" style="width:48px;height:48px;">

</html>
