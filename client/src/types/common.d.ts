interface Menu {
  id: number;
  name: string;
  price: number;
  isPopular: boolean;
  src: string;
}

enum Size {
  UNCHECKED,
  BIG = 0,
  SMALL = 1,
}

enum Temperature {
  UNCHECKED,
  HOT = 0,
  ICE = 1,
}
