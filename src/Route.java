import java.time.Instant;
import java.util.Random;

public class Route {
   private final double[][] ROUTE1 = {{40.72279, -74.00966}, {40.72214, -74.00977}, {40.72147, -74.0099}, {40.72112, -74.00996}, {40.72076, -74.01002}, {40.7203, -74.0101}, {40.72011, -74.01013}, {40.7198, -74.01018}, {40.71945, -74.01024}, {40.71916, -74.01029}, {40.7188, -74.01035}, {40.71845, -74.01041}, {40.71812, -74.01048}, {40.71747, -74.01064}, {40.71688, -74.01079}, {40.71629, -74.01094}, {40.716, -74.01102}, {40.71558, -74.01113}, {40.71553, -74.01114}, {40.71535, -74.01119}, {40.71524, -74.01122}, {40.71519, -74.01124}, {40.71518, -74.01124}, {40.71509, -74.01129}, {40.71492, -74.01137}, {40.7143, -74.01154}, {40.71406, -74.01102}, {40.71395, -74.01078}, {40.71385, -74.01058}, {40.71328, -74.00926}, {40.71256, -74.00767}, {40.71245, -74.00773}, {40.712, -74.00812}, {40.71138, -74.00865}, {40.71091, -74.00906}, {40.71043, -74.00946}, {40.71034, -74.00953}, {40.70995, -74.00987}, {40.70981, -74.00998}, {40.70915, -74.01055}, {40.70881, -74.01086}, {40.7086, -74.01103}, {40.70831, -74.01124}, {40.70807, -74.01144}, {40.70792, -74.01157}, {40.70774, -74.01172}, {40.70765, -74.01179}, {40.70744, -74.01197}, {40.70723, -74.01213}};
   private final double[][] ROUTE2 = {{40.61142, -74.03493}, {40.61134, -74.03499}, {40.61133, -74.03512}, {40.61134, -74.03521}, {40.61134, -74.03526}, {40.61135, -74.03535}, {40.6114, -74.03558}, {40.61145, -74.03574}, {40.61158, -74.036}, {40.61171, -74.0362}, {40.61176, -74.03629}, {40.61188, -74.03647}, {40.61201, -74.03669}, {40.61235, -74.0372}, {40.61242, -74.03729}, {40.61268, -74.03766}, {40.61275, -74.03775}, {40.61282, -74.03786}, {40.61287, -74.03791}, {40.61294, -74.03801}, {40.61296, -74.03814}, {40.61336, -74.03856}, {40.61374, -74.03891}, {40.61385, -74.039}, {40.61435, -74.03936}, {40.6147, -74.03958}, {40.61519, -74.03984}, {40.61546, -74.03995}, {40.616, -74.04013}, {40.61635, -74.04022}, {40.61698, -74.04035}, {40.61716, -74.04038}, {40.61965, -74.04095}, {40.62038, -74.04109}, {40.62136, -74.04122}, {40.62176, -74.04126}, {40.62268, -74.04132}, {40.62319, -74.04134}, {40.62405, -74.04135}, {40.62413, -74.04134}, {40.62502, -74.04133}, {40.62695, -74.0412}, {40.62845, -74.04102}, {40.62891, -74.04094}, {40.63004, -74.04066}, {40.63006, -74.04065}, {40.63035, -74.04055}, {40.63074, -74.0404}, {40.63291, -74.03941}, {40.63486, -74.03845}, {40.63488, -74.03845}, {40.63753, -74.03706}, {40.63756, -74.03705}, {40.6377, -74.03698}, {40.63783, -74.03693}, {40.63785, -74.03693}, {40.63826, -74.03674}, {40.63863, -74.03659}, {40.63886, -74.03648}, {40.63889, -74.03647}, {40.63901, -74.03641}, {40.63902, -74.03641}, {40.63954, -74.03617}, {40.63975, -74.03605}, {40.63991, -74.03594}, {40.64023, -74.03568}, {40.64045, -74.03546}, {40.64055, -74.03535}, {40.64069, -74.03517}, {40.64083, -74.03497}, {40.64091, -74.03484}, {40.64118, -74.03432}, {40.64139, -74.03372}, {40.64144, -74.03355}, {40.64156, -74.03294}, {40.64162, -74.03235}, {40.64164, -74.03206}, {40.64164, -74.03137}, {40.64163, -74.03135}, {40.64163, -74.03119}, {40.64157, -74.0306}, {40.64147, -74.03007}, {40.64146, -74.02997}, {40.64136, -74.02959}, {40.64125, -74.02923}, {40.64124, -74.02921}, {40.64116, -74.02899}, {40.64103, -74.02869}, {40.64099, -74.02857}, {40.6409, -74.02835}, {40.64085, -74.02825}, {40.64075, -74.028}, {40.64067, -74.02784}, {40.64046, -74.02736}, {40.64032, -74.02701}, {40.64023, -74.02675}, {40.64018, -74.02657}, {40.64013, -74.02642}, {40.64009, -74.02627}, {40.64008, -74.02625}, {40.63998, -74.02571}, {40.63994, -74.02525}, {40.63993, -74.02502}, {40.63993, -74.02473}, {40.63997, -74.02423}, {40.64002, -74.02393}, {40.64015, -74.02337}, {40.64016, -74.02336}, {40.64017, -74.02332}, {40.64017, -74.0233}, {40.64024, -74.0231}, {40.6404, -74.0227}, {40.64052, -74.02248}, {40.64052, -74.02247}, {40.64053, -74.02246}, {40.64059, -74.02235}, {40.6406, -74.02231}, {40.64061, -74.02231}, {40.64091, -74.02179}, {40.64119, -74.02138}, {40.64151, -74.02094}, {40.64198, -74.02042}, {40.64208, -74.02032}, {40.64253, -74.01983}, {40.64434, -74.01798}, {40.64447, -74.01776}, {40.64471, -74.01752}, {40.64479, -74.01743}, {40.64521, -74.01703}, {40.64524, -74.01699}, {40.64684, -74.01536}, {40.64685, -74.01536}, {40.6504, -74.01163}, {40.65044, -74.0116}, {40.6515, -74.01048}, {40.65155, -74.01042}, {40.65206, -74.00989}, {40.65212, -74.00982}, {40.6526, -74.00932}, {40.65267, -74.00924}, {40.65323, -74.00866}, {40.65329, -74.00859}, {40.65375, -74.00812}, {40.65393, -74.00795}, {40.65436, -74.00749}, {40.65441, -74.00745}, {40.65602, -74.00578}, {40.65603, -74.00576}, {40.65605, -74.00575}, {40.65659, -74.00518}, {40.65662, -74.00516}, {40.65715, -74.0046}, {40.65716, -74.0046}, {40.65772, -74.00402}, {40.65779, -74.00394}, {40.65827, -74.00345}, {40.65827, -74.00344}, {40.6594, -74.00226}, {40.65941, -74.00226}, {40.65995, -74.00169}, {40.65996, -74.00169}, {40.66051, -74.00112}, {40.66051, -74.00111}, {40.66059, -74.00104}, {40.66107, -74.00054}, {40.66107, -74.00053}, {40.66108, -74.00053}, {40.66111, -74.00049}, {40.66161, -73.99996}, {40.66163, -73.99993}, {40.66423, -73.99723}, {40.66466, -73.99676}, {40.66484, -73.99658}, {40.66503, -73.99642}, {40.66532, -73.99622}, {40.66542, -73.99617}, {40.66552, -73.99611}, {40.66562, -73.99606}, {40.66573, -73.99602}, {40.66574, -73.99601}, {40.66583, -73.99598}, {40.66616, -73.99589}, {40.66626, -73.99588}, {40.66637, -73.99586}, {40.66647, -73.99585}, {40.6667, -73.99584}, {40.6668, -73.99583}, {40.66712, -73.99586}, {40.66758, -73.99595}, {40.66804, -73.99613}, {40.6685, -73.99637}, {40.66886, -73.9966}, {40.66984, -73.99717}, {40.67016, -73.99737}, {40.67066, -73.99766}, {40.67198, -73.99848}, {40.67204, -73.99851}, {40.67206, -73.99853}, {40.67208, -73.99853}, {40.67209, -73.99854}, {40.6722, -73.99861}, {40.67224, -73.99864}, {40.67239, -73.99873}, {40.67275, -73.99897}, {40.67314, -73.99921}, {40.67352, -73.99946}, {40.67359, -73.9995}, {40.67366, -73.99955}, {40.67562, -74.00081}, {40.67592, -74.00095}, {40.67618, -74.0011}, {40.67627, -74.00114}, {40.67645, -74.00124}, {40.67699, -74.00157}, {40.6774, -74.00187}, {40.67751, -74.00194}, {40.67819, -74.00245}, {40.67831, -74.00255}, {40.67836, -74.00258}, {40.67844, -74.00266}, {40.67853, -74.00274}, {40.67854, -74.00274}, {40.67868, -74.00285}, {40.67911, -74.00322}, {40.67917, -74.00326}, {40.67925, -74.0033}, {40.6793, -74.00333}, {40.67948, -74.00338}, {40.6795, -74.00338}, {40.67958, -74.00339}, {40.67972, -74.00339}, {40.67978, -74.00338}, {40.67984, -74.00336}, {40.67985, -74.00336}, {40.67996, -74.00332}, {40.68041, -74.00312}, {40.68127, -74.00271}, {40.68158, -74.00254}, {40.68161, -74.00252}, {40.68307, -74.00181}, {40.68336, -74.00168}, {40.6894, -73.99879}, {40.68954, -73.99873}, {40.68964, -73.9987}, {40.68971, -73.99869}, {40.68973, -73.99868}, {40.68981, -73.99867}, {40.68989, -73.99865}, {40.68998, -73.99865}, {40.69006, -73.99864}, {40.69028, -73.99866}, {40.69046, -73.99869}, {40.6907, -73.99876}, {40.69186, -73.99924}, {40.69193, -73.99926}, {40.692, -73.99929}, {40.69221, -73.99936}, {40.69232, -73.99938}, {40.69253, -73.9994}, {40.69274, -73.9994}, {40.6931, -73.99933}, {40.6933, -73.99926}, {40.69347, -73.99922}, {40.69388, -73.99906}, {40.69392, -73.99904}, {40.69398, -73.99902}, {40.69448, -73.99881}, {40.69625, -73.99796}, {40.69755, -73.99737}, {40.69949, -73.99641}, {40.69955, -73.99637}, {40.69964, -73.99632}, {40.6997, -73.99628}, {40.70002, -73.99601}, {40.70011, -73.99592}, {40.70027, -73.99574}, {40.70035, -73.99564}, {40.7005, -73.99542}, {40.70089, -73.99478}, {40.70106, -73.99444}, {40.70131, -73.99381}, {40.70151, -73.99314}, {40.70156, -73.9929}, {40.70159, -73.99279}, {40.70159, -73.99278}, {40.70163, -73.99256}, {40.70164, -73.99244}, {40.70166, -73.99233}, {40.70167, -73.99221}, {40.70167, -73.99214}, {40.70168, -73.99209}, {40.70168, -73.99175}, {40.70169, -73.99162}, {40.70168, -73.99148}, {40.70168, -73.99134}, {40.70162, -73.99061}, {40.70131, -73.98864}, {40.7013, -73.98852}, {40.70105, -73.98691}, {40.70102, -73.98679}, {40.701, -73.98668}, {40.7009, -73.98632}, {40.70088, -73.98628}, {40.70078, -73.98602}, {40.70064, -73.98573}, {40.70041, -73.98537}, {40.70023, -73.98513}, {40.69996, -73.98485}, {40.69981, -73.98467}, {40.69839, -73.98312}, {40.69796, -73.98268}, {40.69772, -73.98241}, {40.69732, -73.98199}, {40.69708, -73.98172}, {40.697, -73.98162}, {40.69687, -73.98144}, {40.69674, -73.98122}, {40.69669, -73.98111}, {40.69664, -73.98102}, {40.69656, -73.98085}, {40.6965, -73.9807}, {40.69638, -73.98031}, {40.69632, -73.97996}, {40.6963, -73.97976}, {40.6963, -73.97963}, {40.69628, -73.9795}, {40.69628, -73.97897}, {40.69626, -73.97853}, {40.69624, -73.97833}, {40.69613, -73.97621}, {40.69572, -73.96532}, {40.69574, -73.96502}, {40.69579, -73.96469}, {40.6959, -73.96425}, {40.69594, -73.96414}, {40.69597, -73.96403}, {40.69611, -73.96374}, {40.69628, -73.96346}, {40.69646, -73.96323}, {40.69666, -73.96301}, {40.69682, -73.96287}, {40.69701, -73.96273}, {40.69719, -73.96263}, {40.69754, -73.96249}, {40.69758, -73.96247}, {40.69816, -73.96229}, {40.69818, -73.96229}, {40.69847, -73.96222}, {40.69946, -73.9619}, {40.69997, -73.96171}, {40.70021, -73.96163}, {40.70118, -73.96118}, {40.70159, -73.96097}, {40.70682, -73.95798}, {40.70825, -73.95717}, {40.70913, -73.95664}, {40.71083, -73.95552}, {40.71144, -73.95509}, {40.71202, -73.95472}, {40.71245, -73.95442}, {40.71272, -73.95425}, {40.71316, -73.95392}, {40.7133, -73.9538}, {40.7135, -73.9536}, {40.71361, -73.9535}, {40.71386, -73.95319}, {40.71395, -73.9531}, {40.71403, -73.95301}, {40.71416, -73.9529}, {40.71439, -73.95267}, {40.71517, -73.95176}, {40.71577, -73.951}, {40.71598, -73.95071}, {40.71654, -73.94989}, {40.71716, -73.94892}, {40.71739, -73.94858}, {40.71849, -73.94684}, {40.7185, -73.94681}, {40.71871, -73.9465}, {40.71894, -73.9461}, {40.71899, -73.94604}, {40.71914, -73.94581}, {40.72018, -73.94407}, {40.72019, -73.94406}, {40.72049, -73.94352}, {40.72148, -73.94184}, {40.7216, -73.94165}, {40.7219, -73.94123}, {40.72195, -73.94117}, {40.72218, -73.94084}, {40.72244, -73.94049}, {40.72273, -73.94001}, {40.72349, -73.93863}, {40.72377, -73.93801}, {40.72393, -73.93759}, {40.72406, -73.93718}, {40.72409, -73.93704}, {40.72416, -73.93684}, {40.72426, -73.93643}, {40.72428, -73.93637}, {40.72429, -73.93629}, {40.72437, -73.93599}, {40.72445, -73.93559}, {40.72445, -73.93558}, {40.72473, -73.93397}, {40.7248, -73.93364}, {40.72504, -73.93267}, {40.72518, -73.93224}, {40.7252, -73.93214}, {40.72532, -73.93185}, {40.72538, -73.93176}, {40.72545, -73.93161}, {40.72577, -73.93103}, {40.72602, -73.93063}, {40.72627, -73.93029}, {40.72629, -73.93027}, {40.72632, -73.93023}, {40.72639, -73.93015}, {40.72655, -73.92999}, {40.72762, -73.92871}, {40.72764, -73.92869}, {40.72802, -73.92824}, {40.72832, -73.92792}, {40.72873, -73.92745}, {40.72884, -73.92734}, {40.72894, -73.92725}, {40.72912, -73.92707}, {40.72938, -73.92683}, {40.73011, -73.92627}, {40.73021, -73.92621}, {40.73055, -73.92597}, {40.73085, -73.92578}, {40.73093, -73.92572}, {40.73129, -73.92548}, {40.73155, -73.92529}, {40.73242, -73.92474}, {40.7326, -73.92452}, {40.73269, -73.92443}, {40.73274, -73.92436}, {40.73283, -73.9242}, {40.73287, -73.92408}, {40.73291, -73.92389}, {40.73294, -73.92362}, {40.73294, -73.92339}, {40.73286, -73.92294}, {40.73281, -73.92273}, {40.73241, -73.92032}, {40.73235, -73.92004}, {40.73222, -73.91966}, {40.73209, -73.91922}, {40.73197, -73.91892}, {40.73195, -73.91888}, {40.73168, -73.9182}, {40.73159, -73.91793}, {40.73154, -73.9178}, {40.73055, -73.91441}, {40.73053, -73.91432}, {40.73047, -73.91413}, {40.73047, -73.9141}, {40.72983, -73.91166}, {40.72979, -73.91155}, {40.72972, -73.9113}, {40.72957, -73.9109}, {40.72952, -73.91079}, {40.72948, -73.91067}, {40.72922, -73.9101}, {40.72911, -73.90991}, {40.72901, -73.90979}, {40.72876, -73.90954}, {40.72864, -73.9094}, {40.72833, -73.90897}, {40.72826, -73.90885}, {40.72797, -73.90841}, {40.72714, -73.90705}, {40.72687, -73.90654}, {40.72671, -73.90618}, {40.72667, -73.90606}, {40.72657, -73.90581}, {40.72653, -73.90568}, {40.7265, -73.90562}, {40.72648, -73.90553}, {40.72643, -73.9054}, {40.72625, -73.90478}, {40.72609, -73.90405}, {40.72609, -73.90402}, {40.72606, -73.90387}, {40.72604, -73.90371}, {40.72601, -73.90357}, {40.72599, -73.90342}, {40.72594, -73.90315}, {40.72586, -73.90231}, {40.72584, -73.90192}, {40.72586, -73.90171}, {40.72532, -73.89591}, {40.7253, -73.89559}, {40.72524, -73.89502}, {40.7252, -73.89423}, {40.7252, -73.8938}, {40.72522, -73.89338}, {40.72526, -73.89291}, {40.72534, -73.8924}, {40.72554, -73.89152}, {40.72561, -73.89128}, {40.72578, -73.89077}, {40.72588, -73.89052}, {40.72609, -73.89006}, {40.7262, -73.88985}, {40.72741, -73.88782}, {40.72752, -73.8876}, {40.72758, -73.88746}, {40.72765, -73.88732}, {40.72775, -73.88709}, {40.72786, -73.88679}, {40.72805, -73.88621}, {40.72806, -73.8859}, {40.72815, -73.88544}, {40.72819, -73.8851}, {40.72828, -73.88407}, {40.72827, -73.88401}, {40.7285, -73.88099}, {40.72852, -73.88085}, {40.72854, -73.88055}, {40.72861, -73.88015}, {40.7288, -73.87944}, {40.72904, -73.87887}, {40.72937, -73.87817}, {40.72987, -73.87691}, {40.72998, -73.87658}, {40.72999, -73.87656}, {40.73028, -73.87561}, {40.73033, -73.87547}, {40.73045, -73.87506}, {40.73057, -73.8747}, {40.7306, -73.87459}, {40.73063, -73.87451}, {40.73074, -73.87415}, {40.73083, -73.87389}, {40.7315, -73.87161}, {40.73151, -73.87156}, {40.73157, -73.87136}, {40.73158, -73.8713}, {40.73161, -73.8712}, {40.73167, -73.87091}, {40.73168, -73.87082}, {40.73168, -73.87062}, {40.73166, -73.87052}, {40.73163, -73.87041}, {40.73142, -73.86979}, {40.7314, -73.8697}, {40.7314, -73.8696}, {40.73141, -73.8695}, {40.73147, -73.86936}, {40.73151, -73.8693}, {40.7321, -73.8688}, {40.73215, -73.86875}, {40.73219, -73.86869}, {40.73225, -73.86864}, {40.73244, -73.86838}, {40.73245, -73.86835}, {40.7325, -73.86824}, {40.73191, -73.86713}, {40.73175, -73.86672}, {40.73174, -73.86663}, {40.73145, -73.86614}, {40.73136, -73.86596}, {40.73122, -73.86559}, {40.73116, -73.8654}, {40.72925, -73.86015}, {40.72914, -73.85982}, {40.72813, -73.8571}, {40.72795, -73.85657}, {40.72759, -73.85562}, {40.72724, -73.85506}, {40.72683, -73.85389}, {40.72643, -73.85282}, {40.72641, -73.85284}, {40.7264, -73.85286}, {40.72638, -73.85287}, {40.72636, -73.85289}, {40.72372, -73.85455}, {40.72407, -73.85553}, {40.72413, -73.85561}, {40.72442, -73.85542}, {40.72433, -73.85515}};
   private final double[][] ROUTE3 = {{40.81818, -73.93876}, {40.81887, -73.94043}, {40.81905, -73.94085}, {40.81911, -73.9408}, {40.81933, -73.94064}, {40.81963, -73.94043}, {40.81967, -73.9404}, {40.8195, -73.93999}, {40.81889, -73.93853}, {40.81855, -73.9377}, {40.81849, -73.93757}, {40.81823, -73.93698}, {40.81815, -73.93677}, {40.81804, -73.93654}, {40.81779, -73.93594}, {40.81744, -73.93509}, {40.81728, -73.93468}, {40.81726, -73.93463}, {40.81724, -73.93458}, {40.81721, -73.93453}, {40.81719, -73.93449}, {40.81718, -73.93447}, {40.81716, -73.93445}, {40.81714, -73.93443}, {40.81712, -73.93442}, {40.81709, -73.9344}, {40.81706, -73.93438}, {40.81703, -73.93437}, {40.817, -73.93436}, {40.81697, -73.93435}, {40.81692, -73.93434}, {40.81664, -73.93437}, {40.81574, -73.93444}, {40.81547, -73.93444}, {40.81538, -73.93444}, {40.81533, -73.93444}, {40.81528, -73.93444}, {40.81524, -73.93444}, {40.81521, -73.93444}, {40.81518, -73.93444}, {40.81505, -73.93437}, {40.81504, -73.93437}, {40.81497, -73.93438}, {40.81495, -73.93438}, {40.81494, -73.93438}, {40.81493, -73.93438}, {40.81492, -73.93438}, {40.81462, -73.93441}, {40.81431, -73.93446}, {40.81428, -73.93446}, {40.81426, -73.93446}, {40.81425, -73.93446}, {40.81424, -73.93447}, {40.81422, -73.93447}, {40.81421, -73.93447}, {40.8142, -73.93447}, {40.81416, -73.93447}, {40.81414, -73.93447}, {40.81413, -73.93447}, {40.81404, -73.93448}, {40.81403, -73.93448}, {40.81402, -73.93448}, {40.81396, -73.93449}, {40.81395, -73.93449}, {40.81392, -73.93449}, {40.81372, -73.93451}, {40.81271, -73.9346}, {40.8126, -73.93461}, {40.81249, -73.93462}, {40.81237, -73.93464}, {40.81226, -73.93465}, {40.81217, -73.93466}, {40.81205, -73.93469}, {40.81194, -73.93471}, {40.81163, -73.93477}, {40.81086, -73.93499}, {40.81076, -73.93502}, {40.81067, -73.93504}, {40.81057, -73.93506}, {40.81046, -73.93508}, {40.81034, -73.93509}, {40.81023, -73.9351}, {40.8101, -73.93511}, {40.81, -73.93511}, {40.80987, -73.93511}, {40.80977, -73.9351}, {40.80966, -73.93509}, {40.80954, -73.93507}, {40.80943, -73.93505}, {40.80934, -73.93503}, {40.80925, -73.93501}, {40.80915, -73.93499}, {40.80907, -73.93496}, {40.80896, -73.93493}, {40.80885, -73.93489}, {40.80875, -73.93486}, {40.80865, -73.93482}, {40.80854, -73.93478}, {40.80844, -73.93474}, {40.80834, -73.93469}, {40.80824, -73.93464}, {40.80812, -73.93458}, {40.80799, -73.93451}, {40.80788, -73.93444}, {40.80778, -73.93437}, {40.8077, -73.93432}, {40.8076, -73.93425}, {40.80749, -73.93417}, {40.80742, -73.93411}, {40.80732, -73.93403}, {40.80722, -73.93394}, {40.80675, -73.93355}, {40.80643, -73.93332}, {40.80592, -73.93282}, {40.80584, -73.93274}, {40.80575, -73.93266}, {40.8055, -73.9324}, {40.80522, -73.93215}, {40.80514, -73.93207}, {40.80504, -73.93199}, {40.80502, -73.93196}, {40.80496, -73.9319}, {40.80479, -73.93173}, {40.8047, -73.93164}, {40.80461, -73.93156}, {40.8045, -73.93146}, {40.80433, -73.93134}, {40.80424, -73.93128}, {40.80395, -73.93109}, {40.80349, -73.93077}, {40.80341, -73.93071}, {40.80333, -73.93067}, {40.80326, -73.93064}, {40.80319, -73.9306}, {40.80311, -73.93056}, {40.80301, -73.93053}, {40.80292, -73.93049}, {40.80282, -73.93046}, {40.80276, -73.93044}, {40.80245, -73.93033}, {40.80223, -73.93029}, {40.8015, -73.93015}, {40.80145, -73.93013}, {40.8014, -73.93011}, {40.80135, -73.93009}, {40.80129, -73.93007}, {40.80124, -73.93005}, {40.80118, -73.93003}, {40.80113, -73.93001}, {40.80105, -73.92999}, {40.80099, -73.92997}, {40.80089, -73.92995}, {40.80079, -73.92993}, {40.80069, -73.92992}, {40.8006, -73.92991}, {40.8005, -73.9299}, {40.80041, -73.9299}, {40.80033, -73.9299}, {40.80014, -73.92992}, {40.79991, -73.92992}, {40.79978, -73.92992}, {40.79964, -73.92992}, {40.79952, -73.92991}, {40.79945, -73.92991}, {40.79939, -73.9299}, {40.79932, -73.92988}, {40.7992, -73.92986}, {40.79908, -73.92981}, {40.79897, -73.92977}, {40.79873, -73.92968}, {40.79854, -73.92962}, {40.79835, -73.92957}, {40.79815, -73.92952}, {40.79796, -73.92947}, {40.79776, -73.92942}, {40.79746, -73.92936}, {40.79726, -73.92935}, {40.79716, -73.92935}, {40.79714, -73.92935}, {40.79698, -73.92935}, {40.7966, -73.92942}, {40.79631, -73.9295}, {40.79608, -73.92958}, {40.7959, -73.92964}, {40.79578, -73.92969}, {40.79557, -73.92982}, {40.79538, -73.92995}, {40.79519, -73.93009}, {40.79504, -73.93021}, {40.79489, -73.93036}, {40.79476, -73.93052}, {40.7947, -73.9306}, {40.79462, -73.93071}, {40.79452, -73.9309}, {40.79437, -73.93117}, {40.79434, -73.93123}, {40.79429, -73.93132}, {40.79424, -73.93142}, {40.79417, -73.93155}, {40.79407, -73.93172}, {40.7937, -73.9324}, {40.79343, -73.93288}, {40.79333, -73.93306}, {40.79321, -73.93327}, {40.79311, -73.93345}, {40.79299, -73.93365}, {40.79288, -73.93382}, {40.79283, -73.93391}, {40.79277, -73.934}, {40.79266, -73.93417}, {40.79254, -73.93435}, {40.79242, -73.93453}, {40.79229, -73.9347}, {40.79211, -73.93498}, {40.792, -73.93514}, {40.79187, -73.93532}, {40.79187, -73.93533}, {40.79174, -73.93548}, {40.79162, -73.93564}, {40.79148, -73.9358}, {40.79134, -73.93594}, {40.79122, -73.93606}, {40.79107, -73.9362}, {40.79104, -73.93623}, {40.79093, -73.93632}, {40.79078, -73.93644}, {40.79047, -73.93668}, {40.79014, -73.93696}, {40.78993, -73.93709}, {40.78985, -73.93715}, {40.78977, -73.93721}, {40.78969, -73.93727}, {40.78961, -73.93731}, {40.78953, -73.93736}, {40.78945, -73.9374}, {40.78937, -73.93744}, {40.78928, -73.93748}, {40.7892, -73.93752}, {40.78911, -73.93756}, {40.7886, -73.93778}, {40.78793, -73.93808}, {40.78785, -73.93812}, {40.78777, -73.93815}, {40.78768, -73.9382}, {40.78761, -73.93824}, {40.7875, -73.93831}, {40.7874, -73.93838}, {40.78731, -73.93845}, {40.78722, -73.93852}, {40.78713, -73.9386}, {40.78704, -73.93868}, {40.78695, -73.93875}, {40.78667, -73.93901}, {40.78594, -73.93965}, {40.78585, -73.93972}, {40.78576, -73.9398}, {40.78568, -73.93989}, {40.7856, -73.93998}, {40.78552, -73.94007}, {40.78544, -73.94017}, {40.78537, -73.94027}, {40.78529, -73.94039}, {40.78507, -73.9408}, {40.78455, -73.94183}, {40.78437, -73.94218}, {40.78419, -73.94254}, {40.78413, -73.94266}, {40.78406, -73.94278}, {40.784, -73.94289}, {40.78396, -73.94295}, {40.78393, -73.943}, {40.78386, -73.9431}, {40.78378, -73.94321}, {40.7837, -73.9433}, {40.78362, -73.9434}, {40.78354, -73.94349}, {40.78346, -73.94357}, {40.78343, -73.9436}, {40.78337, -73.94365}, {40.78328, -73.94373}, {40.78318, -73.9438}, {40.78309, -73.94387}, {40.78299, -73.94393}, {40.7829, -73.94399}, {40.78286, -73.94401}, {40.78279, -73.94405}, {40.78269, -73.9441}, {40.78258, -73.94414}, {40.78248, -73.94417}, {40.78238, -73.9442}, {40.78227, -73.94423}, {40.78216, -73.94426}, {40.78206, -73.94427}, {40.78197, -73.94428}, {40.78189, -73.94429}, {40.7818, -73.94429}, {40.78171, -73.94429}, {40.78162, -73.94428}, {40.78153, -73.94427}, {40.78143, -73.94426}, {40.78135, -73.94425}, {40.78126, -73.94423}, {40.78117, -73.94421}, {40.78109, -73.94419}, {40.78064, -73.94408}, {40.78055, -73.94406}, {40.78047, -73.94404}, {40.78038, -73.94401}, {40.78029, -73.94399}, {40.78021, -73.94396}, {40.78012, -73.94393}, {40.78003, -73.9439}, {40.77986, -73.94384}, {40.77979, -73.94381}, {40.77969, -73.94377}, {40.77953, -73.94369}, {40.77926, -73.94358}, {40.77835, -73.94314}, {40.77826, -73.9431}, {40.77818, -73.94307}, {40.77809, -73.94303}, {40.77801, -73.943}, {40.77792, -73.94297}, {40.77783, -73.94294}, {40.77775, -73.94291}, {40.77767, -73.94289}, {40.77726, -73.94277}, {40.77705, -73.9427}, {40.77693, -73.94266}, {40.77652, -73.94258}, {40.77636, -73.94255}, {40.77628, -73.94254}, {40.77619, -73.94253}, {40.77611, -73.94252}, {40.77604, -73.94252}, {40.77597, -73.94252}, {40.77589, -73.94253}, {40.77582, -73.94254}, {40.77574, -73.94256}, {40.77565, -73.94258}, {40.77564, -73.94258}, {40.77557, -73.9426}, {40.7755, -73.94262}, {40.77546, -73.94264}, {40.77542, -73.94265}, {40.77534, -73.94269}, {40.77527, -73.94272}, {40.77519, -73.94276}, {40.77511, -73.9428}, {40.77505, -73.94284}, {40.77497, -73.94288}, {40.7749, -73.94293}, {40.77482, -73.94299}, {40.77474, -73.94304}, {40.77466, -73.94311}, {40.77457, -73.94318}, {40.77449, -73.94325}, {40.77448, -73.94326}, {40.7744, -73.94333}, {40.77319, -73.94444}, {40.77309, -73.94452}, {40.77299, -73.94462}, {40.77293, -73.94467}, {40.77286, -73.94474}, {40.7728, -73.94479}, {40.77274, -73.94486}, {40.77268, -73.94492}, {40.77262, -73.945}, {40.77255, -73.94507}, {40.77246, -73.94517}, {40.7724, -73.94525}, {40.77233, -73.94533}, {40.77204, -73.94571}, {40.7719, -73.94593}, {40.77182, -73.94605}, {40.77175, -73.94615}, {40.77168, -73.94625}, {40.77162, -73.94634}, {40.77156, -73.94642}, {40.77149, -73.9465}, {40.7714, -73.94661}, {40.77133, -73.94669}, {40.77126, -73.94676}, {40.77116, -73.94686}, {40.77085, -73.94714}, {40.77054, -73.94743}, {40.77038, -73.94757}, {40.77029, -73.94766}, {40.77024, -73.94771}, {40.77018, -73.94777}, {40.77013, -73.94783}, {40.77006, -73.9479}, {40.77, -73.94796}, {40.76992, -73.94804}, {40.7696, -73.94833}, {40.76914, -73.94876}, {40.76904, -73.94886}, {40.76895, -73.94894}, {40.76888, -73.94901}, {40.76868, -73.94918}, {40.76848, -73.94933}, {40.7684, -73.94938}, {40.76808, -73.94962}, {40.76801, -73.94967}, {40.76795, -73.94973}, {40.76788, -73.94978}, {40.76778, -73.94987}, {40.76716, -73.95042}, {40.76704, -73.95053}, {40.76699, -73.95058}, {40.76693, -73.95063}, {40.76686, -73.95068}, {40.7668, -73.9507}, {40.76677, -73.95072}, {40.76666, -73.9508}, {40.76653, -73.95089}, {40.76588, -73.95146}, {40.76571, -73.95162}, {40.76563, -73.95169}, {40.76554, -73.95177}, {40.76545, -73.95185}, {40.76536, -73.95193}, {40.76526, -73.95203}, {40.76516, -73.95213}, {40.76491, -73.95235}, {40.76467, -73.95257}, {40.76427, -73.95292}, {40.76388, -73.95326}, {40.76367, -73.95345}, {40.76345, -73.95364}, {40.76295, -73.95409}, {40.76285, -73.95417}, {40.76279, -73.95423}, {40.7627, -73.95432}, {40.76261, -73.95441}, {40.76252, -73.9545}, {40.76245, -73.95458}, {40.76234, -73.9547}, {40.76147, -73.95569}, {40.76122, -73.95598}, {40.7612, -73.956}, {40.76117, -73.95604}, {40.76101, -73.95625}, {40.76077, -73.95661}, {40.76065, -73.95679}, {40.7604, -73.95716}, {40.76035, -73.95724}, {40.76025, -73.95739}, {40.76022, -73.95742}, {40.76017, -73.95749}, {40.76008, -73.95759}, {40.76, -73.95768}, {40.75992, -73.95777}, {40.75983, -73.95784}, {40.75973, -73.95793}, {40.75964, -73.958}, {40.75943, -73.95815}, {40.75929, -73.95826}, {40.75914, -73.95836}, {40.75905, -73.95843}, {40.75901, -73.95846}, {40.75889, -73.95855}, {40.75874, -73.95865}, {40.75859, -73.95876}, {40.75831, -73.95897}, {40.75804, -73.95917}, {40.75796, -73.95923}, {40.75789, -73.95928}, {40.75781, -73.95935}, {40.75773, -73.95943}, {40.75769, -73.95947}, {40.7571, -73.96}, {40.75677, -73.96027}, {40.75643, -73.96053}, {40.75633, -73.9606}, {40.75623, -73.96068}, {40.75612, -73.96076}, {40.75603, -73.96083}, {40.75593, -73.96092}, {40.75588, -73.96099}, {40.75582, -73.96105}, {40.75577, -73.96112}, {40.75534, -73.96169}, {40.75525, -73.96182}, {40.75517, -73.96192}, {40.75508, -73.96203}, {40.75497, -73.96214}, {40.75487, -73.96224}, {40.75483, -73.96227}, {40.75476, -73.96234}, {40.75411, -73.96292}, {40.7536, -73.96335}, {40.75352, -73.96342}, {40.75342, -73.96352}, {40.7533, -73.96362}, {40.75316, -73.96378}, {40.75304, -73.9639}, {40.75293, -73.96402}, {40.7527, -73.96435}, {40.75258, -73.96448}, {40.75248, -73.96458}, {40.75246, -73.9646}, {40.75246, -73.96461}, {40.75246, -73.96462}, {40.75246, -73.96465}, {40.75246, -73.96468}, {40.75249, -73.96477}, {40.75254, -73.96491}, {40.75264, -73.96514}, {40.7529, -73.96577}, {40.75307, -73.96618}, {40.75324, -73.96655}, {40.75328, -73.96667}, {40.75373, -73.96773}, {40.7539, -73.96814}, {40.75408, -73.96856}, {40.75417, -73.96878}, {40.75425, -73.96897}, {40.75363, -73.96943}, {40.75299, -73.96988}, {40.75281, -73.97001}, {40.7526, -73.97017}, {40.75237, -73.97034}, {40.75189, -73.97068}, {40.75174, -73.97079}, {40.75111, -73.97125}, {40.7505, -73.97171}, {40.75066, -73.97209}, {40.75101, -73.97292}, {40.75118, -73.97333}, {40.75127, -73.97354}, {40.75136, -73.97375}, {40.75145, -73.97396}, {40.75152, -73.97411}, {40.7516, -73.97432}, {40.75178, -73.97474}, {40.75204, -73.97536}, {40.75209, -73.97547}, {40.75213, -73.97557}, {40.752, -73.97566}, {40.75194, -73.97571}};
   private final double[][] ROUTE4 = {{40.74402, -73.97618}, {40.74412, -73.97639}, {40.74506, -73.97862}, {40.74573, -73.97812}, {40.74597, -73.9787}, {40.74624, -73.97931}, {40.74624, -73.97932}, {40.74633, -73.97952}, {40.74642, -73.97972}, {40.74653, -73.98}, {40.74654, -73.98002}, {40.74687, -73.98085}, {40.74696, -73.98106}, {40.74704, -73.98127}, {40.74708, -73.98135}, {40.74712, -73.98144}, {40.74776, -73.98296}, {40.74844, -73.98247}, {40.74859, -73.98237}, {40.74873, -73.98227}, {40.7489, -73.98214}, {40.74906, -73.98203}, {40.74927, -73.98188}, {40.74936, -73.98181}, {40.74952, -73.9817}, {40.74967, -73.98159}, {40.75004, -73.98133}, {40.75029, -73.98114}, {40.75057, -73.98093}, {40.75091, -73.98068}, {40.75123, -73.98044}, {40.75153, -73.98022}, {40.75123, -73.97952}};

   private double period;
   private double[] home;
   private double[] work;
   private double[][] commute;

   public Route(double period) {
      this.period = period;
      init();
   }

   private void init() {
      chooseCommute();
      home = commute[0];
      work = commute[commute.length-1];
   }

   private void chooseCommute() {
      Random rand = new Random();
      int temp = rand.nextInt(4);

      switch (temp) {
         case 0:
            commute = ROUTE1;
         case 1:
            commute = ROUTE2;
         case 2:
            commute = ROUTE3;
         case 3:
            commute = ROUTE4;
      }
   }

   private double getPeriodPercent() {
      return (Instant.now().getEpochSecond() % period) / period * 100;
   }

   public double[] getLocation() {
      double percent = getPeriodPercent();
      if (percent < 20)
         return home;
      else if (percent < 30)
         return getRouteCoordinate((30 - percent) / 10.0, false);
      else if (percent < 70)
         return work;
      else if (percent < 80)
         return getRouteCoordinate((80 - percent) / 10.0, true);
      else
         return home;
   }

   public double[] getRouteCoordinate(double percent, boolean reverse) {
      if (!reverse)
         return ROUTE1[(int)(ROUTE1.length*percent)];
      else
         return ROUTE1[(int)(ROUTE1.length*(1.0 - percent))];
   }

   public double getPeriod() {
      return period;
   }

   public void setPeriod(double period) {
      this.period = period;
   }

   public double[] getHome() {
      return home;
   }

   public void setHome(double[] home) {
      this.home = home;
   }

   public double[] getWork() {
      return work;
   }

   public void setWork(double[] work) {
      this.work = work;
   }

   public double[][] getCommute() {
      return commute;
   }

   public void setCommute(double[][] commute) {
      this.commute = commute;
   }
}
