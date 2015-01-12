fact {
  all pub: Publication| pub.type = JA implies #pub.journal = 1 &&
  #pub.proceedings = 0 && #pub.book = 0
}

fact {
  all pub: Publication| pub.type = BC implies #pub.book = 1 &&
  #pub.proceedings = 0 && #pub.journal = 0
}

fact {
  all pub: Publication| (pub.type = CP || pub.type = WP) implies #pub.proceedings = 1 &&
  #pub.journal = 0 && #pub.book = 0
}