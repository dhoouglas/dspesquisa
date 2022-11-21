export type GamePlatform = 'X-BOX' | 'PC' | 'PLAYSTATION';

export type Game ={
    id: number;
    title: string;
    platform: GamePlatform;
    label: string;
    value: number;
}