import { Text, StyleSheet, View, Image } from "react-native";
import { TouchableWithoutFeedback } from 'react-native-gesture-handler';
import { useNavigation } from '@react-navigation/native';

import Logo from '../../assets/logo.png';

function Header() {

  const navigation = useNavigation();

  const handleOnPress = () => {
    navigation.navigate('Home' as never, {} as never);
  }

  return (
    <TouchableWithoutFeedback onPress={handleOnPress}>
      <View style={styles.header}>
        <Image 
            style={styles.tinyLogo}
            source={Logo} 
        />
        <Text style={styles.textLogo1}>Big Game</Text>
        <Text style={styles.textLogo2}>Survey</Text>
    </View>
    </TouchableWithoutFeedback>
    
  );
  
}

const styles = StyleSheet.create({
  header: {
    paddingTop: 50,
    height: 90,
    backgroundColor: "#37474F",
    flexDirection: "row",
    justifyContent: "center",
  },
  textLogo1: {
    fontWeight: "bold",
    fontSize: 18,
    fontFamily: "Play_700Bold",
    color: "#ED7947",
    marginLeft: 10,
    marginRight: 5,
  },
  textLogo2: {
    fontWeight: "bold",
    fontFamily: "Play_700Bold",
    fontSize: 18,
    color: "#FFF",
  },
  tinyLogo: {
    width: 25,
    height: 25,
  },
});

export default Header;
