$nombre = Read-Host "Entrer un nombre  "
for ($i=1; $i -le $nombre; $i++){
    $nbre = Read-Host "Saisir le nombre $i "
    $res -= $nbre
}
Write-Host "Le resultat de la soustraction est : $res"
$res = 0