interface PaymentModalProps {
  handleCardPaymentButtonClick: () => void;
  handleCashPaymentButtonClick: () => void;
}

export function PaymentModal({}: PaymentModalProps) {

  return (

  );
}

interface PaymentSpinnerProps {
  text: string;
  requestPayment: () => void;
}

export function PaymentSpinner({ text, requestPayment }: PaymentSpinnerProps) {
  return
}

interface CashPaymentModalProps {
  price: number;
  requestPayment: () => void;
}

export function CashPaymentModal({ price, requestPayment }: CashPaymentModalProps) {
  // 투입 얼마했는지 상태
  
}

interface ReceiptProps {
  menus: (Menu & { quantity: number })[]
  inputAmount: number;
  totalPrice: number;
  change: number;
  paymentType: "현금" | "카드";
}

export function Receipt({ menus }: ReceiptProps) {
  
}
