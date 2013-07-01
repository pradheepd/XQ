<data>
{
let $z := 5

declare function add($a , $b, $c)
{
	for $x in doc("d")
	{
		if($z = 5) then
		$z := $z +(($z*4)div 2)
		else
		$z := $z - 1
	}

	$z := $z + 5 + $a + $b + $c
	
	return 50
}

let $y := add($z, $z , $z)

return $z
}
</data>