# PoweShell_saidHello.ps1
# by @jaf0
#
# single line comments begin with a `#`

<#
  This is a multi-line comment
  
  There are a number of ways to echo output but the simplest is to simply enquote the string
#>

"Hello World!"
<#
  Displays as:
  
Hello World!
  PowerShell also supports `echo`, but if you don't enquote the string, it will display
  each word on a single line
#>
echo Hello World!
<#
  Displays as
  
Hello
World!
#>
