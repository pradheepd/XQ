<data><node>
{
let $z := doc("sample.xml")
let $x := $z/bookstore/book/price
let $sum := 0

for $y in $z/bookstore/book/price
{
	$sum := $sum + $y
}
}
</node></data>