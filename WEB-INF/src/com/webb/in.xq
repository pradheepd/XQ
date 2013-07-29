<data><node>
{
let $z := doc("sample.xml")/bookstore/book[@category = "WEB"]
let $sum := 0
let $u := doc("sample.xml")
let $m := $u/bookstore/book@category
let $percentage := 0

for $y in $z/price
{
	$sum := $sum + $y
}

for $y in $z/price
{
	$percentage := ($y div $sum) * 100
}
}
</node></data>