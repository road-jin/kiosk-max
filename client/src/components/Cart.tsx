import { PaymentModal } from "./Payment";

interface CartProps {
  cartItems: CartItem[];
  handleItemRemoveButtonClick: (id: number) => void;
  handleAllRemoveButtonClick: (id: number) => void;
}

interface CartItem extends Menu {
  count: number;
  size: Size;
  temperature: Temperature;
}

export default function Cart({ cartItems, handleItemRemoveButtonClick, handleAllRemoveButtonClick }: CartProps) {
  // isPaymentModalOpen 상태를 관리하는 로직

  // 카드결제 눌렀을 때 로딩인디케이터 띄우는 함수
  // 현금결제 눌렀을 때 현금결제 모달 띄우는 함수

  // const items = ruduceCartItem()

  return (
    <>
      {items.map((item, index) => (
        <CartItem item={item} handleItemRemoveButtonClick={handleItemRemoveButtonClick} />
      ))}
      <PaymentModal />
    </>
  );
}

// [
//   {
//     id: 1,
//     name: "아메리카노",
//     imageSrc: "",
//     ...,
//     size: Size.BIG,
//     temperature: Temperature.HOT,
//     count: 5,
//   },
//   {
//     id: 1,
//     name: "아메리카노",
//     imageSrc: "",
//     ...,
//     size: Size.SMALL,
//     temperature: Temperature.ICE,
//     count: 2,
//   },//   {
//     id: 1,
//     name: "아메리카노",
//     imageSrc: "",
//     ...,
//     size: Size.SMALL,
//     temperature: Temperature.ICE,
//     count: 2,
//   },
// ];

interface ReducedCartItem {
  id: number;
  name: string;
  imageSrc: string;
  count: number;
}

const ruduceCartItem = (cartItems: CartItem[]): ReducedCartItem[] => {
  // return cartItems.reduce((acc, cur) => {
  //   const index = acc.findIndex((item) => item.id === cur.id);
  //   if (index === -1) {
  //     acc.push({
  //       id: cur.id,
  //       name: cur.name,
  //       imageSrc: cur.imageSrc,
  //       count: 1,
  //     });
  //   } else {
  //     acc[index].count += 1;
  //   }
  //   return acc;
  // }
};

interface CartItemProps {
  id: number;
  name: string;
  imageSrc: string;
  count: number;
  handleItemRemoveButtonClick: (id: number) => void;
}

function CartItem({ item }: CartItemProps) {
  return (
    <div>
      <img src="" alt="" />
      <div>{item.name}</div>
      <div>{item.count}</div>
    </div>
  );
}
