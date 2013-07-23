<data><node>
{
let $z := doc("sample.xml")/bookstore/book[price > 40]
let $sum := 0

for $y in $z/price
{
	$sum := $sum + $y
}
}
</node></data>