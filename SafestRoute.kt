val mapFragment = supportFragmentManager.findFragmentById(R.id.map) as SupportMapFragment
mapFragment.getMapAsync { googleMap ->
    // Add markers for safe zones
    // ...

    // Calculate and display safe routes using Directions API
    // ...
}