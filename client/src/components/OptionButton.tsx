import style from "./OptionButton.module.css";

interface OptionButtonProps {
  type: "Size" | "Temperature" | "Payment";
  text: string;
  isSelected?: boolean;
}

export default function OptionButton({ type, text, isSelected }: OptionButtonProps) {
  let className;
  switch (type) {
    case "Size":
      className = style.Size;
      break;
    case "Temperature":
      className = style.Temperature;
      break;
    case "Payment":
      className = style.Payment;
      break;
  }

  if (isSelected) {
    className += " " + style.Selected;
  }

  return (
    <div className={className}>
      <span className={style.Text}>{text}</span>
    </div>
  );
}
