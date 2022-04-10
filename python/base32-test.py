import base64

print("Pjesa e encoder-it: ")
print("==========================")
plainText = input("Plain teksti i pa enkoduar: ")
base32_encodedText = base64.b32encode(plainText.encode("utf-8"))
print("Plain teksti i enkoduar: ", base32_encodedText.decode("utf-8"))
# print(base64.b32encode("abc".encode("utf-8")).decode("utf-8"))

print("\nPjesa e decoder-it: ")
print("==========================")
print("\nTeksti i enkoduar per dekodim", base32_encodedText.decode("utf-8"))
base32_enMessage = base32_encodedText
base32_bytes = base32_enMessage
plainTextDecoded_bytes = base64.b32decode(base32_bytes)
plainTextDecoded = plainTextDecoded_bytes.decode("utf-8")

print("Teksti i dekoduar: ", plainTextDecoded)

// creating a new client socket and connection with server using same port as server 

const client = new net.Socket(); 

client.connect(58901, process.argv[2], () => { 

console.log('Connected to server'); 

console.log("If u want to get your access to write read or execute please type 'login' "); 

});
