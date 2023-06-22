import MenuItem from "./MenuItem";
import style from "./MenuList.module.css";

interface MenuListProps {
  menus: Menu[];
  handleMenuItemClick: (menu: Menu) => void;
}

export default function MenuList({ menus, handleMenuItemClick }: MenuListProps) {
  return (
    <main className={`${style.MenuList} ${style.AnimateIn}`}>
      <ul className={style.MenuListContainer}>
        {menus.map((menu) => (
          <li className={style.MenuItem} onClick={() => handleMenuItemClick(menu)}>
            <MenuItem key={menu.id} menu={menu} />
          </li>
        ))}
      </ul>
    </main>
  );
}
